<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="pl">


<head>
    <meta charset="utf-8">
    <title>Edycja zapotrzebowania zakupu</title>

</head>
<h1>Edycja zapotrzebowania zakupu</h1>
<form:form method="post" action="/user/editPR/{id}" modelAttribute="purchaseRequestsOptional">
    Indeks zapotrzebowania:
    <form:hidden path="id" value="${id}"/>
    <form:input path="indication"/><br/>
    <form:errors path="indication"/><br/>

    <input type="submit" value="edytuj zapotrzebowanie">

</form:form>
</html>