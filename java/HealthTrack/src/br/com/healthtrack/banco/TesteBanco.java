package br.com.healthtrack.banco;
import java.sql.Connection;
import java.sql.SQLException;

public class TesteBanco {
    public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão realizada com sucesso");
        connection.close();
    }
}
