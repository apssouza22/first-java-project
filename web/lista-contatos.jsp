<%-- 
    Document   : lista-contatos
    Created on : Oct 1, 2014, 11:51:18 PM
    Author     : apssouza
--%>

<%@page import="java.sql.Connection"%>
<%@page import="br.com.caelum.jdbc.modelo.Contato"%>
<%@page import="br.com.caelum.jdbc.dao.ContatoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*,
        br.com.caelum.jdbc.*" %>
<!DOCTYPE html>
<html>
  <body>
    <table>
      <%
          Connection connection = (Connection) request.getAttribute("connection");
      ContatoDao dao = new ContatoDao(connection);
      List<Contato> contatos = dao.getLista();
      
      for (Contato contato : contatos ) {
      %>
        <tr>
          <td><%=contato.getNome() %></td> 
          <td><%=contato.getEmail() %></td>
          <td><%=contato.getEndereco() %></td>
          <td><%=contato.getDataNascimento().getTime() %></td>
        </tr>
      <%
      }
      %>
    </table>
      ${param.idade}
  </body>
</html>
