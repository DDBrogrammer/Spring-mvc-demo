<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
The customer comfirmed: ${customer.firstName} ${customer.lastName}
<br>
Passes: ${customer.freePasses}
<br>
Postal code: ${customer.postalCode}
<br>
Course Code: ${customer.courseCode}
</body>
</html>