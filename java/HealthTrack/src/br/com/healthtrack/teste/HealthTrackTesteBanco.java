package br.com.healthtrack.teste;

import br.com.healthtrack.entidades.Acesso;

public class HealthTrackTesteBanco {
    
    public static void main(String[] args) {
        
        Acesso a = new Acesso();

        a.setCdAcesso(1);
        a.setdescAcesso("ADM");
        System.out.println("Restrição de acesso criada. Linhas afetadas:" + a.AdicionaAcesso());


        a.setCdAcesso(2);
        a.setdescAcesso("Usuario");
        System.out.println("Restrição de acesso criada. Linhas afetadas:" + a.AdicionaAcesso());


        a.setCdAcesso(3);
        a.setdescAcesso("Especial");
        System.out.println("Restrição de acesso criada. Linhas afetadas:" + a.AdicionaAcesso());
        
       //System.out.println(a.VisualizarAcessos());

       //System.out.println(a.SelecionaAcesso(2));

       a.RemoveAcesso(1);
       System.out.println("acesso removido");
       a.RemoveAcesso(2);
       System.out.println("acesso removido");
       //a.RemoveAcesso(3);
       //System.out.println("acesso removido");
        

       System.out.println(a.VisualizarAcessos());
    }
    
}
