package com.example.config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Emp extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        ServletContext context=getServletContext();
        PrintWriter out=response.getWriter();
        ServletConfig config=getServletConfig();
       out.print(config.getInitParameter("name2"));
        out.print(context.getInitParameter("name1"));
    }
}
