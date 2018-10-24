package comlokumcubaba.model;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "customer")
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer CUST_ID;

    @Column
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

    public void setTc(String TC) {
        this.TC = TC;
    }
    public String getTC() {
        return TC;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return Name;
}
    public void setAddress(String address){
        this.Address =address;
    }
    public String getAddress(){
        return Address;
    }
    public void setPhone(String phone){
        this.Phone=phone;
    }
    public String getPhone(){
        return Phone;
    }
    public void setMail(String mail){
        this.Mail = mail;
    }
    public String getMail(){
        return Mail;
    }
    public void setBirth(Date date){
        this.Birth = date;
    }
    public Date getBirth(){
        return this.Birth;
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

    public void setCUST_ID(Integer cust_id){
        this.CUST_ID=cust_id;
    }
    public Integer getCUST_ID(){
        return CUST_ID;
    }

}