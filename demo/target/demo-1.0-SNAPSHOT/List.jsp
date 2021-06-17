<%@ page import="java.io.PrintWriter" %>
<html>
<body>
<%
    String zoner=request.getParameter("zoner");
    session.setAttribute("zoner",zoner);
    PrintWriter pw= response.getWriter();
    if(zoner.equals("thriller")){

        pw.println("<a style =\"color:red\" href=\"youtube.com/watch?v=HwDxmyVhWEs\">The Secret</a>");
    }
    else if(zoner.equals("family entertainer")){
        pw.println("<a style =\"color:red\" href=\"https://www.youtube.com/watch?v=3zpbmdQRWhY\">Prathi roju pandaga rojee</a>");
    }
    else if(zoner.equals("Education")){
        pw.println("<a style =\"color:red\" href=\"https://www.youtube.com/playlist?list=PLE0F6C1917A427E96\">java brains</a>");

    }
    else{
        pw.println("no result for " +zoner);
    }
%>
<form action="Logout.jsp">
    <input type="submit" value="logout">
</form>
</body>
</html>