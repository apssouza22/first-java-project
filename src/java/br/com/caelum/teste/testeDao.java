/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author apssouza
 */
public class testeDao {

    public void insert() throws ClassNotFoundException {
        // pronto para gravar
        Contato contato = new Contato();
        contato.setNome("Alex");
        contato.setEmail("contato@caelum.com.br");
        contato.setEndereco("R. Vergueiro 3185 cj57");
        contato.setDataNascimento(Calendar.getInstance());

        // grave nessa conexão!!!
        ContatoDao dao = new ContatoDao();

        // método elegante
        dao.adiciona(contato);

        System.out.println("Gravado!");
    }

    public void listar() throws ClassNotFoundException {
        ContatoDao dao = new ContatoDao();
        List<Contato> contatos = dao.getLista();
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Endereço: " + contato.getEndereco());
            System.out.println("Data de Nascimento: "
                    + contato.getDataNascimento().getTime() + "\n");
            System.out.println("---------------------");
        }
    }
}
