package br.com.healthtrack.entidades;

import java.util.List;

import br.com.healthtrack.dao.AcessoDao;

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
	public String getDescAcesso() {
		return descAcesso;
	}

	/**
	 * @param descAcesso passa o valor do parametro descAcesso para a variavel descAcesso
	 */
	public void setdescAcesso(String descAcesso) {
		this.descAcesso = descAcesso;
	}

	//Link entre o dao e a tela de controle
	public int AdicionaAcesso(){
		AcessoDao aDao = new AcessoDao();
		return aDao.Add(this);
	}

	public List<Acesso> VisualizarAcessos(){
		AcessoDao aDao = new AcessoDao();
		return aDao.Getall();
	}

	public Acesso SelecionaAcesso(int id){
		AcessoDao aDao = new AcessoDao();
		return aDao.GetById(id);
		
	}

	public int RemoveAcesso(int id){
		AcessoDao aDao = new AcessoDao();
		return aDao.Delete(id);
	}


	@Override
	public String toString() {
		return "{" +
			" cdAcesso='" + getCdAcesso() + "'" +
			", descAcesso='" + getDescAcesso() + "'" +
			"}";
	}
	
}
