<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="GetPNames">
    Name:<input type="text" name="name">
    Campus:<input type="text" name="campus">
    Department:<input type="text" name="department">
    Rollno:<input type="text" name="rollno">
    <input type="submit" value="Finish">
</form>
</body>
</html>