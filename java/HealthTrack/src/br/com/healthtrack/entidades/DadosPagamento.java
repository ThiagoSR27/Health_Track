package br.com.healthtrack.entidades;

public class DadosPagamento {
	private int cdDadosPagamento;
	private int formaPagamento;
	private int numeroCartao;
	private String nomeNoCartao;
	private String dtVencCartao;
	private String codVerificacao;
	

	/*Construtor */
	public DadosPagamento() {
		
	}

	/**
	 * @return retorna os dados armazenados em cdDadosPagamento
	 */
	public int getCdDadosPagamento() {
		return cdDadosPagamento;
	}

	/**
	 * @param cdDadosPagamento passa para cdDadosPagamento
	 */
	public void setCdDadosPagamento(int cdDadosPagamento) {
		this.cdDadosPagamento = cdDadosPagamento;
	}

	/**
	 * @return retorna os dados armazenados em formaPagamento
	 */
	public int getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * @param formaPagamento passa os dados para formaPagamento
	 */
	public void setFormaPagamento(int formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * @return  retorna os dados armazenados em numeroCartao
	 */
	public int getNumeroCartao() {
		return numeroCartao;
	}

	/**
	 * @param numeroCartao passa os dados para numeroCartao
	 */
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	/**
	 * @return retorna os dados armazenados em nomeNoCartao
	 */
	public String getNomeNoCartao() {
		return nomeNoCartao;
	}

	/**
	 * @param nomeNoCartao passa os dados para nomeNoCartao
	 */
	public void setNomeNoCartao(String nomeNoCartao) {
		this.nomeNoCartao = nomeNoCartao;
	}

	/**
	 * @return retorna os dados armazenados em dtVencCartao
	 */
	public String getDtVencCartao() {
		return dtVencCartao;
	}

	/**
	 * @param dtVencCartao passa os dados para dtVencCartao
	 */
	public void setDtVencCartao(String dtVencCartao) {
		this.dtVencCartao = dtVencCartao;
	}

	/**
	 * @return retorna os dados armazenados em codVericacao
	 */
	public String getCodVerificacao() {
		return codVerificacao;
	}

	/**
	 * @param codVerificacao passa os dados armazenados em codVerificacao
	 */
	public void setCodVerificacao(String codVerificacao) {
		this.codVerificacao = codVerificacao;
	}
}
