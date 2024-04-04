package br.edu.infnet.licitacaoApp.model.domain;

public class ChefeLicitacao extends Funcionario {
	private int tempoServico;
	
	
	@Override
	public String toString() {
		return "chefe de licitacao: " + getNome();
	}
	public ChefeLicitacao(String nome) {
		super(nome);
	}
	public int getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

}
