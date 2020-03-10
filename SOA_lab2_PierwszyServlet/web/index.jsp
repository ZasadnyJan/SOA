<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: QCXM38
  Date: 3/4/2020
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Aplikacja webowa</title>
  </head>
  <body>
  <h1>To jest moja pierwsza apka webowa </h1>
  <p>Strona statyczna</p>

  <%
    Date tmp=new Date();
    out.println("<h2> " + tmp.toString() + "</h2>");
  %>
  </body>
</html>
