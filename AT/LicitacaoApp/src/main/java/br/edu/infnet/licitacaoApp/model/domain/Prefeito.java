package br.edu.infnet.licitacaoApp.model.domain;

public class Prefeito extends Funcionario{

	private String partido;

	public Prefeito(String nome) {
		super(nome);
	}
	
	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
}
