package comlokumcubaba.dao;

import comlokumcubaba.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    private JdbcTemplate jdbcTemplate;

    public CustomerDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addCustomer(Customer c) {
        String SQL = "insert into customer ( Name, TC, Address, Phone, Mail, Birth, CommerceInfo, ReasonInfo, CityInfo, InvestingInfo, AdditionInfo) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(SQL, c.getName(), c.getTC(), c.getAddress(), c.getPhone(), c.getMail(), c.getBirth(), c.getCommerceInfo(), c.getReasonInfo(), c.getCityInfo(), c.getInvestingInfo(), c.getAdditionInfo());
    }


}