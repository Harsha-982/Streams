package com.example.config;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


public class HelloServlet extends HttpServlet {
    private String message;



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        ServletContext con=getServletContext();
        out.println(con.getInitParameter("name1"));
        ServletConfig config =getServletConfig();
        out.println(config.getInitParameter("name"));

    }

    public void destroy() {
    }
}