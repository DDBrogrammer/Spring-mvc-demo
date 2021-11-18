<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

First name: <form:input path="firstName"/>
<br>
<br>
Last name: <form:input path="lastName"/>
<br>
<br>
<form:select path="country">
<form:option value="Brazil" label="Brazil"/>
<form:option value="France" label="France"/>
<form:option value="India" label="India"/>
<form:option value="Vietnam" label="Vietnam"/>
</form:select>
<br>
<br>
Favorite Language:
Java <form:radiobutton path="favoriteLanguage" value="Java"/>
Js <form:radiobutton path="favoriteLanguage" value="Js"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>
<br>
<br>
Operating Systems:
Linux<form:checkbox path="operatingSystems" value="Linux"/>
Mac os<form:checkbox path="operatingSystems" value="Mac OS"/>
MS Window<form:checkbox path="operatingSystems" value="MS Window"/>
<br>
<br>
<input type="submit" value="Submit"/>
</form:form>





</body>

</html>
