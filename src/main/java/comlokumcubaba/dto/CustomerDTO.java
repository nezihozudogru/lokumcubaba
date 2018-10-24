package comlokumcubaba.dto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CustomerDTO {

    public String TC;
    private String Name;
    private String Address;
    private String Phone;
    private String Mail;
    private Date Birth;
    private String CommerceInfo;
    private String ReasonInfo;
    private String CityInfo;
    private String InvestingInfo;
    private String AdditionInfo;


        public String getTC() {
            return TC;
        }
    public void setTC(String TC) {
        this.TC = TC;
    }
        public String getName() {
            return Name;
        }
    public void setName(String name) {
        this.Name = name;
    }
        public String getAddress(){
            return Address;
        }
    public void setaddress(String address){
        this.Address=address;
    }
        public String getPhone(){
            return Phone;
        }
    public void setPhone(String phone){
        this.Phone=phone;
    }

        public String getMail(){
            return Mail;
        }
    public void setMail(String mail){
        this.Mail=mail;
    }
        public Date getBirth(){
            return Birth;
        }
    public void setBirth(String date){
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate = format.parse(date);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        this.Birth=   sqlDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void setCommerceInfo(String commerceInfo){
        this.CommerceInfo=commerceInfo;
    }
    public String getCommerceInfo(){
        return CommerceInfo;
    }
    public void setReasonInfo(String reasonInfo){
        this.ReasonInfo=reasonInfo;
    }
    public String getReasonInfo(){
        return ReasonInfo;
    }
    public void setCityInfo(String cityInfo
    ){
        this.CityInfo=cityInfo;
    }
    public String getCityInfo(){
        return CityInfo;
    }
    public void setInvestingInfo(String investingInfo){
        this.InvestingInfo=investingInfo;
    }
    public String getInvestingInfo(){
        return InvestingInfo;
    }
    public void setAdditionInfo(String additionInfo){
        this.AdditionInfo=additionInfo;
    }
    public String getAdditionInfo(){
        return AdditionInfo;
    }


}