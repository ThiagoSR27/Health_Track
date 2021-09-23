package br.com.healthtrack.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.entidades.DadosCorporais;

public class DadosCorporaisDao {

    public List <DadosCorporais> getAll(){

        List<DadosCorporais> listaDadosCorporais = new ArrayList<>();

        listaDadosCorporais.add(new DadosCorporais(55, "23/09/2021"));
        listaDadosCorporais.add(new DadosCorporais(82, "22/08/2021"));
        listaDadosCorporais.add(new DadosCorporais(90, "22/03/2021"));
        listaDadosCorporais.add(new DadosCorporais(88, "15/01/2021"));

        return listaDadosCorporais;
    }
}
    
