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
<body>

<center>

<div align="center"><h2>LOKUMCU BABA ÖN BAŞVURU FORMU</h2> </div>
<form class="form-horizontal"
      action="<spring:url value="CustomerForm"/>" method="GET">
    <fieldset>
        <div class="form-group">
            <label class="col-md-4 control-label" for="customerForm">
            </label>
            <div class="col-md-4">
                <button type="submit" id="customerForm" class="btn btn-primary">Bayilik Başvuru Yap</button>
            </div>
        </div>
    </fieldset>
</form>
</center>
</body>
</html>