<%-- 
    Document   : index
    Created on : Oct 1, 2014, 12:29:40 PM
    Author     : apssouza
--%>

<%@page import="br.com.caelum.teste.testeDao"%>
<%@page import="br.com.caelum.jdbc.ConnectionFactory"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            testeDao t = new testeDao();
            t.insert();
            t.listar();
        %>
    </body>
</html>
