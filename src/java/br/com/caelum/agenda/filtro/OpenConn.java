/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.agenda.filtro;

import br.com.caelum.jdbc.ConnectionFactory;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author apssouza
 */
@WebFilter(filterName = "OpenConn", urlPatterns = {"/*"})
public class OpenConn implements Filter {

    private Connection connection;

    public OpenConn() {
    }

    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException, ClassNotFoundException {

        this.connection = new ConnectionFactory()
                .getConnection("");

        // "pendura um objeto no Request"    
        request.setAttribute("connection", connection);

    }

    private void doAfterProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException, SQLException {

        this.connection.close();

    }

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        try {
            doBeforeProcessing(request, response);
            
            chain.doFilter(request, response);
            
            doAfterProcessing(request, response);
        } catch (IOException | ServletException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }


    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {
    }

    /**
     * Init method for this filter
     * @param filterConfig
     */
    @Override
    public void init(FilterConfig filterConfig) {
        
    }

}
