package com.example.Login1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Logout")

public class Logoutpage extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter pw = response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);

        Cookie ck = new Cookie("name", "");
        ck.setMaxAge(0);
        response.addCookie(ck);

        pw.print("you are successfully logged out!");
    }
}
