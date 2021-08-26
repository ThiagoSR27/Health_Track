package br.com.healthtrack;

/**
 * Classe que abstrai o cadastro de um peso.
 * @author thiag_edf
 * @version 1.0
 */
public class DadosCorporais {
	
	/**Peso do usuario.*/
	private int peso;
	
	/**Data em que o cadastro foi realizado*/
	private String data;
	
	public DadosCorporais() {
		
	}

	/**
	 * @return o valor da variavel peso.
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param passa o valor do parametro peso para a variavel peso.
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return o valor da variavel data.
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param passa o valor do parametro data para a variavel data.
	 */
	public void setData(String data) {
		this.data = data;
	}
}
