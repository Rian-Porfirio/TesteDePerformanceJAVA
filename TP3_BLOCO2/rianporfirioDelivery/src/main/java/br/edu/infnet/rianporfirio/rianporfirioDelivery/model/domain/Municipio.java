package br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain;

public class Municipio {

	private Integer id;
	private String nome;

	@Override
	public String toString() {
		return "--Municipio: " + getNome();
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
}
