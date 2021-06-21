package com.example.Try;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;
@WebServlet("/GetPNames")
public class GetPNames extends HttpServlet
{
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        PrintWriter out = res.getWriter();

        Enumeration e = req.getParameterNames();

        while(e.hasMoreElements())
        {
            Object obj = e.nextElement();
            String fieldName = (String) obj;
            String fieldValue = req.getParameter(fieldName);
            out.println(fieldName + " : " + fieldValue + " ");
        }

        out.close();
    }
}