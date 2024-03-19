package br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private int idade;
	private float salario;
	private Restaurante restaurante;
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Funcionario: " + getNome() + getRestaurante();
	}

	public Funcionario() {
	}

	public Funcionario(String nome) {
		this();
		this.nome = nome;
	}

	public Funcionario(String nome, String sobrenome, int idade, float salario, Restaurante restaurante,
			Endereco endereco) {
		this(nome);
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.salario = salario;
		this.restaurante = restaurante;
		this.endereco = endereco;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
