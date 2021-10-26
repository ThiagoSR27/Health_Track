package br.com.healthtrack.dao;
import br.com.healthtrack.banco.ConnectionFactory;
import br.com.healthtrack.entidades.Acesso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcessoDao {

    private Connection caminho;

    public AcessoDao(){
        this.caminho = new ConnectionFactory().getConnection();
    }

    public void inserir(Acesso variaveis) {
        
        PreparedStatement banco = null;

        try{
            String sql = "insert into t_ht_acesso(cd_acesso, ds_acesso) values(?,?)";
            banco = caminho.prepareStatement(sql);
            
            banco.setInt(1, variaveis.getCdAcesso());
            banco.setString(2, variaveis.getdescAcesso());

            banco.executeUpdate();

            banco.close();
        }

        catch(SQLException u){
            System.err.println("Problema com o banco de dados");
        }
        finally{
            try{
                banco.close();
                caminho.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }

    }
    
}
