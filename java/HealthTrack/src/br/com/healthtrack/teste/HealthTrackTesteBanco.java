package br.com.healthtrack.teste;

import br.com.healthtrack.dao.AcessoDao;
import br.com.healthtrack.entidades.Acesso;


public class HealthTrackTesteBanco {
    
    public static void main(String[] args) {
        
        Acesso variaveis = new Acesso();

        System.out.println("codigo do acesso = 1");
        
        variaveis.setCdAcesso(1);

        System.out.println("Descrição da permição = ADM");
        variaveis.setdescAcesso("ADM");

        //AcessoDao gravar = new AcessoDao();
        //gravar.inserir(variaveis);

        System.out.println("codigo do acesso = 2");
        
        variaveis.setCdAcesso(2);

        System.out.println("Descrição da permição = Usuario");
        variaveis.setdescAcesso("Usuario");

        AcessoDao gravar = new AcessoDao();
        gravar.inserir(variaveis);
        

    }
    
}
