package br.edu.infnet.licitacaoApp.model.domain;

public class Prefeitura {

	private String cidade;
	private int populacao;
	private String estado;
	private Prefeito prefeito;
	
	@Override
	public String toString() {
		return "Prefeitura de: " + getCidade();
	}
	
	public Prefeito getPrefeito() {
		return prefeito;
	}

	public void setPrefeito(Prefeito prefeito) {
		this.prefeito = prefeito;
	}

	public Prefeitura(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
