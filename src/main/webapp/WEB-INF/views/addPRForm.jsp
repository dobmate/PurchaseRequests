<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="pl">


<head>
    <meta charset="utf-8">
    <title>Dodawania zapotrzebowania zakupu</title>

</head>
<h1>Dodawanie zapotrzebowania zakupu</h1>
<form:form method="post" action="/user/add/pr" modelAttribute="pr">
    Indeks zapotrzebowania: <form:input path="indication"/><br/>
    <form:errors path="indication"/><br/>

    <input type="submit" value="Dodaj Zapotrzebowanie">

</form:form>
</html>