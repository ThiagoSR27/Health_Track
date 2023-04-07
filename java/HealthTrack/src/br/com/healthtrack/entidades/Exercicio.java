package br.com.healthtrack.entidades;

/**
 * Classe que abstrai o cadastro de um exercicio feito pelo usuario
 * @author thiag_edf
 * @version 1.0
 *
 */
public class Exercicio {
	
	/**Data em que o exercicio foi realizado*/
	private String dataExercicio;
	
	/**Descri��o do exercicio*/
	private String dsExercicio;
	
	/**Dura��o do exercicio*/
	private float duracao;

	/*Construtor */
	public Exercicio() {
		
	}

	/**
	 * @return o valor da variavel dataExercicio 
	 */
	public String getDataExercicio() {
		return dataExercicio;
	}

	/**
	 * @param dataExercicio passa o valor do parametro dataExercicio para a variavel dataExercicio
	 */
	public void setDataExercicio(String dataExercicio) {
		this.dataExercicio = dataExercicio;
	}

	/**
	 * @return o valor da variavel dsExercicio
	 */
	public String getDsExercicio() {
		return dsExercicio;
	}

	/**
	 * @param dsExercicio passa o valor do parametro dsExercicio para a variavel dsExercicio
	 */
	public void setDsExercicio(String dsExercicio) {
		this.dsExercicio = dsExercicio;
	}

	/**
	 * @return retorna o valor da variavel duracao
	 */
	public float getDuracao() {
		return duracao;
	}

	/**
	 * @param  duracao passa o valor do parametro duracao para a variavel duracao
	 */
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
}
