package br.com.healthtrack.entidades;
/**
 * Classe que abstrai o cadastro de um usuario.
 * @author thiag_edf
 * @version 1.0
 *
 */
public class Usuario {
	
	/*Codigo do usuario.**/
	private int cdUsuario;

	private String nome;
    private String sobrenome;
    private int idade;

	
	/**Numero do celular.*/
	private int telCelular;
	
	/**Usuario*/
	private String nmUser;
	
	/**Senha*/
	private String nrSenha;
	
	/**Email*/
	private String email;
	
	/**Numero do CPF*/
	private int cpf;
	
	/*Construtor */
	public Usuario() {

	}


	/**
	 * @return retorna os dados armazenados em Usuario
	 */
	public int getCdUsuario() {
		return cdUsuario;
	}


	/**
	 * @param cdUsuario passa os dados para cdUsuario
	 */
	public void setCdUsuario(int cdUsuario) {
		this.cdUsuario = cdUsuario;
	}


	


	/**
	 * @return retorna dos dados armazenados em TelCelular
	 */
	public int getTelCelular() {
		return telCelular;
	}


	/**
	 * @param telCelular passa os dados para TelCelular
	 */
	public void setTelCelular(int telCelular) {
		this.telCelular = telCelular;
	}


	/**
	 * @return retorna os dados armazenados em NmUser
	 */
	public String getNmUser() {
		return nmUser;
	}


	/**
	 * @param nmUser passa os dados para NmUser
	 */
	public void setNmUser(String nmUser) {
		this.nmUser = nmUser;
	}


	/**
	 * @return retorna os dados armazenados em NrSenha
	 */
	public String getNrSenha() {
		return nrSenha;
	}


	/**
	 * @param nrsenha passa os dados armazenados para nrSenha
	 */
	public void setNrSenha(String nrsenha) {
		this.nrSenha = nrsenha;
	}


	/**
	 * @return retorna os dados armazenados em email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email passa os dados armazenados para email
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return retorna os dados armazenados em cpf
	 */
	public int getCpf() {
		return cpf;
	}


	/**
	 * @param cpf passa os dados armazenados para cpf
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
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
