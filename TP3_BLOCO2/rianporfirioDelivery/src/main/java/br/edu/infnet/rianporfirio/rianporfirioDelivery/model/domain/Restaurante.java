package br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain;

import java.util.List;

public class Restaurante {

	private String nome;
	private String descricao;
	private List<Entregador> entregadores;
	private List<Funcionario> funcionarios;
	private Endereco endereco;
	private float valorCorrida;

	@Override
	public String toString() {
		return " Restaurante: " + getNome();
	}
	
	public Restaurante() {
	}
	
	public Restaurante(String nome) {
		this();
		this.nome = nome;
	}

	public Restaurante(String nome, float valorCorrida) {
		this(nome);
		this.valorCorrida = valorCorrida;
	}

	public Restaurante(String nome, String descricao, Endereco endereco, float valorCorrida) {
		this(nome, valorCorrida);
		this.descricao = descricao;
		this.endereco = endereco;
	}

	public Restaurante(String nome, String descricao, List<Entregador> entregadores, List<Funcionario> funcionarios,
			Endereco endereco, float valorCorrida) {
		this(nome, descricao, endereco, valorCorrida);
		this.entregadores = entregadores;
		this.funcionarios = funcionarios;
		this.valorCorrida = valorCorrida;
	}

	public float getValorCorrida() {
		return valorCorrida;
	}

	public void setValorCorrida(float valorCorrida) {
		this.valorCorrida = valorCorrida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Entregador> getEntregadores() {
		return entregadores;
	}

	public void setEntregadores(List<Entregador> entregadores) {
		this.entregadores = entregadores;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
