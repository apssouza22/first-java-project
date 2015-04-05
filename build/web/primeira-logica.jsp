<%@page import="br.com.caelum.jdbc.modelo.Contato"%>
<%@page import="java.util.List"%>
<html>
  <body>
    <h1> Página da nossa primeira lógica </h1>
    <% 
        List<Contato> contatos;
         contatos = (List) request.getAttribute("contatos");
        
    for(int i = 0; i < contatos.size(); i++){
        out.println(contatos.get(i).getNome());
    }
    %>
  </body>
</html>