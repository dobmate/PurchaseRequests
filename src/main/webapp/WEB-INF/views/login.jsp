<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">

<head>
    <meta charset="utf-8">
    <title>Logowanie użytkownia - Zapotrzebowania zakupowe</title>
</head>
<body>
<form method="post" action="/login">
    <h1>Logowanie</h1>
    login <input type="text" name="login" placeholder="Wprowadź login"><br/>
    hasło <input type="password" name="password" placeholder="Wprowadź hasło"><br/>
    <button type="submit"> Zaloguj się </button>
</form>
</body> 