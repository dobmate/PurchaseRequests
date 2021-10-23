
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<header>
  <nav>
    <div>
      <h4>Użytkownik ${user.name}</h4>
      <a href="/logout">Kliknij aby wylogować ${user.name}</a>
    </div>
  </nav>
</header>