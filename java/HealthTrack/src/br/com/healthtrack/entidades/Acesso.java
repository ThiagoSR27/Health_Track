package br.com.healthtrack.entidades;

/**Abstrai uma classe que ira determinar o nivel de acesso do usuario ao sistema
 * @author thiag_ed
 * @version 1.0
 *
 */
public class Acesso {
	/**Codigo do nivel de acesso*/
	private int cdAcesso;
	
	/**Descri��o do nivel de acesso*/
	private String descAcesso;

	/*Construtor */
	public Acesso() {
		
	}
	
	/**
	 * @return retorna o valor da variavel cdAcesso
	 */
	public int getCdAcesso() {
		return cdAcesso;
	}

	/**
	 * @param cdAcesso passa o valor do parametro cdAcesso para a variavel cdAcesso
	 */
	public void setCdAcesso(int cdAcesso) {
		this.cdAcesso = cdAcesso;
	}

	/**
	 * @return o valor da variavel desAcesso
	 */
	public String getdescAcesso() {
		return descAcesso;
	}

	/**
	 * @param descAcesso passa o valor do parametro descAcesso para a variavel descAcesso
	 */
	public void setdescAcesso(String descAcesso) {
		this.descAcesso = descAcesso;
	}

	
}
