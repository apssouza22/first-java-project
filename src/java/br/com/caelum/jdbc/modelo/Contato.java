/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.jdbc.modelo;

import java.util.Calendar;

/**
 *
 * @author apssouza
 */
public class Contato {

  private Long id;
  private String nome;
  private String email;
  private String endereco;
  private Calendar dataNascimento;

  // métodos get e set para id, nome, email, endereço e dataNascimento

  public String getNome() {
    return this.nome;
  }
  public void setNome(String novo) {
    this.nome = novo;
  }

  public String getEmail() {
    return this.email;
  }
  public void setEmail(String novo) {
    this.email = novo;
  }

  public String getEndereco() {
    return this.endereco;
  }
  public void setEndereco(String novo) {
    this.endereco = novo;
  }

  public Long getId() {
    return this.id;
  }
  public void setId(Long novo) {
    this.id = novo;
  }

  public Calendar getDataNascimento() {
    return this.dataNascimento;
  }
  public void setDataNascimento(Calendar dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
}
