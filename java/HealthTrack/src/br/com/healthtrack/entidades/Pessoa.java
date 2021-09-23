package br.com.healthtrack.entidades;

/**
 * Classe que abstrai uma pessoa.
 * @author thiag_edf
 * @version 1.0
 *
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;


    /*Construtor */
    public Pessoa(){

    }

    /**
	 * @return retorna dos dados armazenados em Nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome passa os dados para nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return retorna os dados armazenados em Sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}


	/**
	 * @param sobrenome passa os dados para sobrenome
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

    /**
	 * @return retorna os dados armazenados em idade
	 */
	public int getIdade() {
		return idade;
	}

    /**
	 * @param idade passa os dados para idade
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
