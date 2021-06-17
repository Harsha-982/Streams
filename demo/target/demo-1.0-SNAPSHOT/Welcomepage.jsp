<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
    <%
        String name=(String)session.getAttribute("name");
        if(name==null){
            response.sendRedirect("index.jsp");
        }
    %>
    Hi
    ${name}<br>
    Welcome to my page<br>
    <hr>
    <a href="Video.jsp">click here for videos</a>
</body>
</html>