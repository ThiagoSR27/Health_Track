package br.com.healthtrack.dao;

import java.util.List;

/**Interface responsavel por armazenar as assinaturas das operações que seram realizadas */
public interface IDataHandler <T> {

    public List<?> Getall();

    public T GetById(int id);

    public int Add(T obj);

    public int Delete (int id);

    public int Update (T obj);

}
