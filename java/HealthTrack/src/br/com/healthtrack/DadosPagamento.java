package br.com.healthtrack;

public class DadosPagamento {
	private int cdDadosPagamento;
	private int formaPagamento;
	private int numeroCartao;
	private String nomeNoCartao;
	private String dtVencCartao;
	private String codVerificacao;
	
	public DadosPagamento() {
		
	}

	/**
	 * @return the cdDadosPagamento
	 */
	public int getCdDadosPagamento() {
		return cdDadosPagamento;
	}

	/**
	 * @param cdDadosPagamento the cdDadosPagamento to set
	 */
	public void setCdDadosPagamento(int cdDadosPagamento) {
		this.cdDadosPagamento = cdDadosPagamento;
	}

	/**
	 * @return the formaPagamento
	 */
	public int getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * @param formaPagamento the formaPagamento to set
	 */
	public void setFormaPagamento(int formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * @return the numeroCartao
	 */
	public int getNumeroCartao() {
		return numeroCartao;
	}

	/**
	 * @param numeroCartao the numeroCartao to set
	 */
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	/**
	 * @return the nomeNoCartao
	 */
	public String getNomeNoCartao() {
		return nomeNoCartao;
	}

	/**
	 * @param nomeNoCartao the nomeNoCartao to set
	 */
	public void setNomeNoCartao(String nomeNoCartao) {
		this.nomeNoCartao = nomeNoCartao;
	}

	/**
	 * @return the dtVencCartao
	 */
	public String getDtVencCartao() {
		return dtVencCartao;
	}

	/**
	 * @param dtVencCartao the dtVencCartao to set
	 */
	public void setDtVencCartao(String dtVencCartao) {
		this.dtVencCartao = dtVencCartao;
	}

	/**
	 * @return the codVerificacao
	 */
	public String getCodVerificacao() {
		return codVerificacao;
	}

	/**
	 * @param codVerificacao the codVerificacao to set
	 */
	public void setCodVerificacao(String codVerificacao) {
		this.codVerificacao = codVerificacao;
	}
}
