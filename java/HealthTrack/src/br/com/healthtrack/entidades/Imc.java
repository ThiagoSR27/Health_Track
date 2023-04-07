package br.com.healthtrack.entidades;

/**
 * Classe heran�a IMC
 * @author thiag_edf
 * @version 1.0
 *
 */
public class Imc {
	private float altura;
	private float imc;
	/**Altura do usuario*/

	/*construtor*/
	public Imc() {
		
	}

	/**
	 * @return retorna o valor da variavel altura
	 *
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura passa o valor do parametro altura para a variavel altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getImc() {
		return this.imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	
}
