package comlokumcubaba.controllers;

import comlokumcubaba.dao.CustomerDAO;
import comlokumcubaba.dto.CustomerDTO;
import comlokumcubaba.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping(value = "CustomerForm", method = RequestMethod.GET)
    public ModelAndView showCustomerPage() {
        CustomerDTO c = new CustomerDTO();

        c.setCommerceInfo("Yes");
        ModelAndView modelAndView = new ModelAndView("Customer", "command", c);
        return modelAndView;
    }

    @ModelAttribute("customer")
    @RequestMapping(value = "/Customer", method = RequestMethod.POST)
    public ModelAndView addCustomer(@ModelAttribute("customerDTO") @Validated CustomerDTO customerDTO) {

        Customer c = new Customer();
        c.setName(customerDTO.getName());
        c.setTc(customerDTO.getTC());
        c.setAddress(customerDTO.getAddress());
        c.setPhone(customerDTO.getPhone());
        c.setMail(customerDTO.getMail());
        c.setBirth(customerDTO.getBirth());
        c.setCommerceInfo(customerDTO.getCommerceInfo());
        c.setReasonInfo(customerDTO.getReasonInfo());
        c.setCityInfo(customerDTO.getCityInfo());
        c.setInvestingInfo(customerDTO.getInvestingInfo());
        c.setAdditionInfo(customerDTO.getAdditionInfo());

        customerDAO.addCustomer(c);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Success");

        return modelAndView;
    }

    @ModelAttribute("CityInfoList")
    public Map<String, String> getCityInfo() {
        Map<String, String> CityInfoList = new HashMap<String, String>();
        CityInfoList.put("IST", "İstanbul");
        CityInfoList.put("IZR", "İzmir");
        CityInfoList.put("BAL", "Balıkesir");
        CityInfoList.put("ANK", "Ankara");
        return CityInfoList;
    }
}
