package br.com.healthtrack.banco;

import java.sql.Connection;
import java.sql.DriverManager;
//import java .sql.SQLException;

public class ConnectionFactory{

    public Connection getConnection(){

        try{
            return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM88831", "131192");

        }
        catch(Exception excecao){
            System.err.println("Erro no banco");
            throw new RuntimeException(excecao);
        }

        
    }
}