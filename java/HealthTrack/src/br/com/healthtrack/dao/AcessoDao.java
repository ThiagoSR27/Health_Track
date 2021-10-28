package br.com.healthtrack.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.healthtrack.entidades.Acesso;

public class AcessoDao implements IDataHandler<Acesso>  {

    @Override
    public List<Acesso> Getall() {
        // TODO Auto-generated method stub
        Dao dao = new Dao();
        List<Acesso> listA = new ArrayList<Acesso>();
        PreparedStatement stmt;
        

        try {
            stmt = dao.GetConnetion().prepareStatement("select * from t_ht_acesso");

            ResultSet result = null;
            result = dao.GetData(stmt);
            
            while(result.next()){
                Acesso a = new Acesso();
                a.setCdAcesso(result.getInt("cd_acesso"));
                a.setdescAcesso(result.getString("ds_acesso"));
                listA.add(a);
            }
            return listA;
        } 
        catch (Exception e) {
            //TODO: handle exception
        }
        return null;
    }

    @Override
    public Acesso GetById(int id) {
        // TODO Auto-generated method stub
        Dao dao = new Dao();
        PreparedStatement stmt;

        try {
            stmt = dao.GetConnetion().prepareStatement("select * from t_ht_acesso where cd_acesso = ?");
            stmt.setInt(1, id);
            ResultSet result = null;
            result = dao.GetData(stmt);

            while(result.next()){
                Acesso a = new Acesso();
                a.setCdAcesso(result.getInt("cd_acesso"));
                a.setdescAcesso(result.getString("ds_acesso"));
                return a;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int Add(Acesso obj) {
        // TODO Auto-generated method stub
        Dao dao = new Dao();
        try {
            PreparedStatement stmt = dao.GetConnetion().prepareStatement("insert into t_ht_acesso(cd_acesso, ds_acesso) values(?,?)");
            stmt.setInt(1, obj.getCdAcesso());
            stmt.setString(2, obj.getDescAcesso());
            return dao.ExecuteCommand(stmt);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int Delete(int id) {
        // TODO Auto-generated method stub
        Dao dao = new Dao();
        try {
            PreparedStatement  stmt = dao.GetConnetion().prepareCall("delete from t_ht_acesso where cd_acesso = ?");
            stmt.setInt(1, id);
             return dao.ExecuteCommand(stmt);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int Update(Acesso obj) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
