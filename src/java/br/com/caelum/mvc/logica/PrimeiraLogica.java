/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.mvc.logica;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;
import java.sql.Connection;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apssouza
 */
public class PrimeiraLogica implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        String nomes[] = {"Alex", "Marcia", "Gabi"};
        req.setAttribute("nomes", nomes);
        
        // buscando a conexão do request
        Connection connection = (Connection) req.getAttribute("connection");
        
        List<Contato> contatos = new ContatoDao(connection).getLista();
    
        req.setAttribute("contatos", contatos);
        
        return "primeira-logica.jsp";

    }
}
