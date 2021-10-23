<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html lang="pl">


<head>
    <meta charset="utf-8">
    <title>Dodawanie produktu</title>
</head>
<h1>Dodawanie produktu</h1>
<form:form method="post" action="/add/item" modelAttribute="item">
    nazwa produktu: <form:input path="title"/><br/>
    <form:errors path="title"/><br/>

    opis produktu: <form:input path="description"/><br/>
    <form:errors path="description"/><br/>

</form:form>
</html>