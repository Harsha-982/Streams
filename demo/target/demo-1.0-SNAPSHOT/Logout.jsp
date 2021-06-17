<%@ page import="java.io.PrintWriter" %>
<html>
<body>
    <%
        PrintWriter pw= response.getWriter();
        if(session.getAttribute("name")==null){
            pw.println("You haven't logged in");
        }
        else{
            session.removeAttribute("name");
            session.invalidate();
            pw.println("Succesfully logged out");
        }
    %>
</body>
</html>