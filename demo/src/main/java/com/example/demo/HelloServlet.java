package com.example.demo;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String name=request.getParameter("username");
        String password=request.getParameter("password");
        PrintWriter out= response.getWriter();
        if(name.equals("Harshavardhini") && password.equals("Harsha")) {
            HttpSession session=request.getSession();
            session.setAttribute("name",name);
            response.sendRedirect("Welcomepage.jsp");
        }
        else {
            response.sendRedirect("index.jsp");
        }
        out.close();
    }
}