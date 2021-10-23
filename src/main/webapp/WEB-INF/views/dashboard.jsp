<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="utf-8">
    <title>Strona główna </title>
</head>

<body>
<div>
    <jsp:include page="header.jsp"/>
</div>
<div>
    <jsp:include page="menu.jsp"/>
</div>
<div>
    <div>
        <p>Wniosek zakupowy</p>
        <p>Poniżej jest lista wnioów zakupowych</p>
        <p>Proszę wprowadzić niezbędne informacje:
        <li>Poprawna data</li>
        <li>Produkty </li>
        <li>Czas reakcji ( pliny / standardowy / niski ) </li>
        <li>rCena</li>

        Proszę o weryfikacji zanim zaakceptujesz
        </p>
    </div>
</div>
</body>
</html>