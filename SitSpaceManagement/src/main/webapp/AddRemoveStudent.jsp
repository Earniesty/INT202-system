<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 29/10/2566
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Remove Student</title>
</head>
<body>
<h1>SitSpaceManagement</h1>
<br>
<h2>PAGE: <a href="AddRemoveStudent.jsp">ADD/REMOVE Student</a> | <a href="AllData.jsp">All Data</a></h2>
<br>
<form action="AddServlet" method="post">
    <h3 style="font-weight: bolder">Add Student Data</h3>
    <label for="idText">ID: </label>
    <input type="numberText" name="idText" id="idText">
    <label for="nameText">Name: </label>
    <input type="textText" name="nameText" id="nameText">
    <label for="scoreText">Score: </label>
    <input type="numberText" name="scoreText" id="scoreText">
    <input type="submit" value="ADD">
</form>
    <hr>
    <h3 style="font-weight: bolder">Remove Student</h3>
<form action="RemoveServlet" method="post">
    <label for="removeText">ID:</label>
    <input type="number" name="removeText" id="removeText">
    <input type="submit" value="REMOVE">
</form>
<hr>
    <h3>${Message}</h3>

</body>
</html>
