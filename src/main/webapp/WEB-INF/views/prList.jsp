<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pl">

<head>
  <meta charset="utf-8">
  <title>Lista zapotrzebowań</title>

</head>

<body>
<div>
  <jsp:include page="header.jsp"/>
</div>
<div>
  <jsp:include page="menu.jsp"/>
</div>
<table>
  <thead>
  <td>Indeks</td>
  </thead>

  <c:forEach items="${purchaseRequests}" var="pr">
    <tr>
      <td>${pr.indication}</td>
      <td><a href="/user/editPR/${pr.id}">Zmień nr indeksu</a></td>
      <td><a href="/user/add/item/${pr.id}">Dodaj produkty</a></td>
      <td><a href="/user/deletePR/${pr.id}">Usuń</a></td>
    </tr>
  </c:forEach>
</table>
</body>