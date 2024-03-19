package br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain;

public class Estado {
	private Integer id;
	private String nome;
	private String sigla;

	@Override
	public String toString() {
		return "Estado: " + getNome()+ " |Sigla: " + getSigla();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
