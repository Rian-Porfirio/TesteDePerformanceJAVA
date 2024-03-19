package br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain;

public class Entregador {

	private String nome;
	private String sobrenome;
	private int idade;
	private int codigoEntregador;
	private Restaurante restaurante;
	private float salario;
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Entregador: " + getNome() + getRestaurante();
	}

	public Entregador() {
	}

	public Entregador(String nome) {
		this();
		this.nome = nome;
	}

	public Entregador(String nome, String sobrenome, int idade, int codigoEntregador, Restaurante restaurante,
			float ganhosTotais, Endereco endereco) {
		this(nome);
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.codigoEntregador = codigoEntregador;
		this.restaurante = restaurante;
		this.salario = ganhosTotais;
		this.endereco = endereco;
	}

	public float calculoSalarioTotal(int corridas) {
		return corridas * restaurante.getValorCorrida() + salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCodigoEntregador() {
		return codigoEntregador;
	}

	public void setCodigoEntregador(int codigoEntregador) {
		this.codigoEntregador = codigoEntregador;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
