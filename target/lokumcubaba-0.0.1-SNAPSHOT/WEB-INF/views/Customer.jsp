<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lokumcu Baba</title>

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
</body>
<body>
<center>
<style>
    tr{
        height: 50px;
    }
</style>


<h2>BAŞVURU FORMU<h2>
<form:form method = "POST" action = "Customer">
    <table>
        <tr>
            <td  ><form:label class="col-md-4 control-label" path = "Name">İSİM SOYİSİM </form:label> </td>
            <td><form:input path = "Name" class="form-control is-valid input-md" required="required" placeholder="Alanı Doldurunuz"  ></form:input></td>
        </tr>

        <tr>
            <td><form:label class="col-md-4 control-label" path = "TC">TC KİMLİK</form:label></td>
            <td><form:input  path = "TC" required="required" placeholder="Alanı Doldurunuz"  pattern="\d{11}" class="form-control is-valid input-md"
                            title="Bu input'a sadece 11 karakterli sayısal değer girilebilir" /></td>
        </tr>
        <tr>
            <td><form:label class="col-md-4 control-label"  path = "Address">ADRES</form:label></td>
            <td><form:textarea rows = "5" cols = "30"  path = "Address" class="form-control input-md" required="required"  placeholder="Alanı Doldurunuz"  /></td>
        </tr>
        <tr>
            <td><form:label class="col-md-4 control-label" path = "Phone">TELEFON</form:label></td>
            <td><form:input path = "Phone"  class="form-control input-md" required="required" placeholder="(5**)-123-4567"/></td>
        </tr>

        <tr>
            <td><form:label class="col-md-4 control-label" path = "Mail">E-POSTA</form:label></td>
            <td><form:input path = "Mail" placeholder="iletisim@bulutmd.com" size="30" required="required"
                            title="E-Posta adresinizi giriniz." class="form-control input-md"/></td>
        </tr>
        <tr>
            <td><form:label class="col-md-4 control-label"  placeholder="Alanı doldurunuz"  path = "Birth">Doğum Tarihi</form:label></td>
            <td><form:input type="date" id="datePicker"   value="1996-07-02"   path = "Birth" class="form-control input-md" /></td>
        </tr>
        <tr>
            <td><form:label class="col-md-10 control-label" path = "CommerceInfo">PERAKENDE SATIŞI İLE UĞRAŞTINIZ MI?</form:label></td>
            <td>
                <form:radiobutton path = "CommerceInfo" value = "Yes" label = "Evet" class="form-check-input" />
                <form:radiobutton path = "CommerceInfo" value = "No" label = "Hayır" class="form-check-input" />
            </td>
        </tr>
        <tr>
            <td><form:label class="col-md-10 control-label" path = "ReasonInfo" >LOKUMCU BABAYI TERCİH ETME SEBEBİNİZ NEDİR?</form:label></td>
            <td><form:input path = "ReasonInfo" placeholder="Alanı Doldurunuz" required="required"  class="form-control input-md" /></td>
        </tr>
        <tr>
            <td><form:label class="col-md-10 control-label" path = "CityInfo">HANGİ İL İÇİN LOKUMCU BABA İŞLETMECİLİĞİ
                DÜŞÜNÜYORSUNUZ?</form:label></td>
            <td>
                <form:select class="col-md-10 form-control dropdown"  path = "CityInfo">
                    <form:option value = "NONE" label = "Seçiniz"/>
                    <form:options items = "${CityInfoList}" />
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label class="col-md-10 control-label" path = "InvestingInfo">YATIRIM MİKTARINIZ NEDİR?</form:label></td>
            <td><form:input path = "InvestingInfo" placeholder="Alanı Doldurunuz" required="required" class="form-control input-md" /></td>
        </tr>
        <tr>
            <td><form:label class="col-md-10 control-label" path = "AdditionInfo">EKLEMEK İSTEDİKLERİNİZ</form:label></td>
            <td><form:textarea path = "AdditionInfo" rows = "5" cols = "30" required="required" placeholder="Alanı Doldurunuz" class="form-control input-md" /></td>
        </tr>
        <tr>
            <td align="center" colspan = "2">
                <input type = "submit"  class="btn btn-primary" value = "Başvuruyu Onayla"/>
            </td>
        </tr>
    </table>
</form:form>
</center>
</body>

</html>