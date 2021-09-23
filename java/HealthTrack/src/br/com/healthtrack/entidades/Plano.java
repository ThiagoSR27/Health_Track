package br.com.healthtrack.entidades;

/**
 * Classe de cadastro de planos pagos para o aplicativo
 * @author thiag_edf
 * @version 1.0
 *
 */
public class Plano {
	/**Codigo do plano*/
	private int codPlano;
	
	/**Descri��o do plano*/
	private String descPlano;
	
	/**Valor do plano*/
	private float valorPlano;
	
	/*Construtor */
	public Plano() {
		
	}

	/**
	 * @return o valor da variavel codPlano
	 */
	public int getCodPlano() {
		return codPlano;
	}

	/**
	 * @param codPlano passa o valor do parametro codPlano para a variavel codPlano
	 */
	public void setCodPlano(int codPlano) {
		this.codPlano = codPlano;
	}

	/**
	 * @return o valor da variavel descPlano	
	 */
	public String getDescPlano() {
		return descPlano;
	}

	/**
	 * @param descPlano passa o valor do parametro descPlano para a variavel descPlano
	 */
	public void setDescPlano(String descPlano) {
		this.descPlano = descPlano;
	}

	/**
	 * @return o valor da variavel valorPlano
	 */
	public float getValorPlano() {
		return valorPlano;
	}

	/**
	 * @param valorPlano passa o valor do parametro valorPlano para a variavel valorPlano
	 */
	public void setValorPlano(float valorPlano) {
		this.valorPlano = valorPlano;
	}
}
