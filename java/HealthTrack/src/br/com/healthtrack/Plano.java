package br.com.healthtrack;

public class Plano {
	private int codPlano;
	private String descPlano;
	private float valorPlano;
	
	public Plano() {
		
	}

	/**
	 * @return the codPlano
	 */
	public int getCodPlano() {
		return codPlano;
	}

	/**
	 * @param codPlano the codPlano to set
	 */
	public void setCodPlano(int codPlano) {
		this.codPlano = codPlano;
	}

	/**
	 * @return the descPlano
	 */
	public String getDescPlano() {
		return descPlano;
	}

	/**
	 * @param descPlano the descPlano to set
	 */
	public void setDescPlano(String descPlano) {
		this.descPlano = descPlano;
	}

	/**
	 * @return the valorPlano
	 */
	public float getValorPlano() {
		return valorPlano;
	}

	/**
	 * @param valorPlano the valorPlano to set
	 */
	public void setValorPlano(float valorPlano) {
		this.valorPlano = valorPlano;
	}
}
