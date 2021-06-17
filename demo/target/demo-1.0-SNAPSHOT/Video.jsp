<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<body>
    <%
        if(session.getAttribute("name")==null){
            response.sendRedirect("index.jsp");
        }
    %>
    <form action="List.jsp">
        <select>
            <input type="radio" name="zoner" value="thriller"> thriller</input>
            <input type="radio" name="zoner" value="family entertainer">family entertainer</input>
            <input type="radio" name="zoner" value="Education"> Education</input>
            <input type="submit">
        </select>
    </form>
</body>
</html>