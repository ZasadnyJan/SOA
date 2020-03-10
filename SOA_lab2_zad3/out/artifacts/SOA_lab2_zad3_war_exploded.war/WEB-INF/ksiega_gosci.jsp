<%@ page import="java.io.FileReader" %>
<%@ page import="java.io.BufferedReader" %><%--
  Created by IntelliJ IDEA.
  User: QCXM38
  Date: 3/9/2020
  Time: 11:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Księga gości</title>
</head>
<body>

<p>Please submit your feedback:</p>
<form action="submit_servlet" name="Form" id="Form" method="post" >
    Your name: <input type="text" name="name" id="name"/><br>
    Your email: <input type="text" name="email" id="email"/><br>
    Comment: <input type="text" name="comment" id="comment" size="50"/><br>
    <input type="submit" value="Send feedback"/>
</form>
<%
    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\QCXM38\\Documents\\SOA\\SOA_lab2_zad3\\wpisy.txt"));
    String line = reader.readLine();
    while (line != null) {
        String[] split=line.split(";");
        out.print("----------------------<br>");
        out.print(split[0] +"("+ split[1] +") says:<br>");
        out.print(split[2]+"<br>");
        line = reader.readLine();
    }
%>

</body>
</html>
