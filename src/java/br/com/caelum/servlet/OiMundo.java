/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apssouza
 */
public class OiMundo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, 
        HttpServletResponse response) 
        throws ServletException, IOException {
    
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>Primeira Servlet</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Oi mundo Servlet!</h1>");
    out.println("</body>");
    out.println("</html>");
}
}

