package br.com.healthtrack;
/**
 * Classe que abstrai o cadastro de um usuario.
 * @author thiag_edf
 * @version 1.0
 *
 */
public class Usuario {
	
	/*Codigo do usuario.**/
	private int cdUsuario;
	
	/*Nome do usuario.**/
	private String nome;
	
	/**Sobrenome do usuario.*/
	private String sobrenome;
	
	/**Numero do celular.*/
	private String telCelular;
	
	/**Usuario*/
	private String nmUser;
	
	/**Senha*/
	private String nrsenha;
	
	/**Email*/
	private String email;
	
	/**Numero do CPF*/
	private int cpf;
	
	
	public Usuario() {

	}


	/**
	 * @return the cdUsuario
	 */
	public int getCdUsuario() {
		return cdUsuario;
	}


	/**
	 * @param cdUsuario the cdUsuario to set
	 */
	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}


	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	/**
	 * @return the telCelular
	 */
	public String getTelCelular() {
		return telCelular;
	}


	/**
	 * @param telCelular the telCelular to set
	 */
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}


	/**
	 * @return the nmUser
	 */
	public String getNmUser() {
		return nmUser;
	}


	/**
	 * @param nmUser the nmUser to set
	 */
	public void setNmUser(String nmUser) {
		this.nmUser = nmUser;
	}


	/**
	 * @return the nrsenha
	 */
	public String getNrsenha() {
		return nrsenha;
	}


	/**
	 * @param nrsenha the nrsenha to set
	 */
	public void setNrsenha(String nrsenha) {
		this.nrsenha = nrsenha;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the cpf
	 */
	public int getCpf() {
		return cpf;
	}


	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
