package br.com.healthtrack.teste;

import java.util.List;

import br.com.healthtrack.dao.DadosCorporaisDao;
import br.com.healthtrack.entidades.DadosCorporais;

public class HealthTrackTesteColecoes {
    public static void main(String[] args) {

        
        
        System.out.println("Dados");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        List<DadosCorporais> listaDadosCorporais = new DadosCorporaisDao().getAll();

        for(DadosCorporais dados : listaDadosCorporais){
            System.out.println(dados);
        }
    }
}
