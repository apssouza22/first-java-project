/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.jdbc;

import java.sql.*;

/**
 *
 * @author apssouza
 */
public class ConnectionFactory {

    public Connection getConnection(String db) throws ClassNotFoundException {
        try {
                        
            if (db == "pg") {
                Class.forName("org.postgresql.Driver");
                return DriverManager.getConnection(
                        "jdbc:postgresql://localhost/cursojsp2", "postgres", "5834");
            }

            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/caelum", "root", "");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
