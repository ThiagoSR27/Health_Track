package br.com.healthtrack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**Classe generica utilizada para conexão com o banco de dados
 * persistir e consultar dados
 */
public class Dao {

    private Connection connection;

    public Dao(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
    }

    public Connection GetConnetion(){
        ConnectionFactory();
        System.out.println("Conexão com o banco de dados efetuada !");
        return this.connection;
    }

    //Responsavel por abrir a conexão com o banco de dados
    private void ConnectionFactory(){
        try {
            this.connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM88831", "131192");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void CloseConnection(){
        try {
            if(this.connection != null){

                this.connection.close();
            }
            
        } catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    /**Metodo responsavel por executar comandos sql (insert,update,delete) */
    public int ExecuteCommand(PreparedStatement stmt){
        int linhas = 0;
        try {
            linhas = stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            CloseConnection();
        }
        return linhas;
    }


    public ResultSet GetData(PreparedStatement stmt){
        
        ResultSet resultset = null;
        try {
            resultset =  stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            //CloseConnection();
        }
        return resultset;
    }
}
