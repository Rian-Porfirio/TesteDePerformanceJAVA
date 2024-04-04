package br.edu.infnet.licitacaoApp.model.domain;

public class Item {
	private String nomeItem;
	private String categoria;
	private float valorInicial;
	private int quantidade;
	private Data dataInicio;
	private Data dataTermino;
	private Empresa fornecedor;

	public String getNomeItem() {
		return nomeItem;
	}

	public Item(String nomeItem) {
		super();
		this.nomeItem = nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(float valorInicial) {
		this.valorInicial = valorInicial;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Data getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Data dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Data getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Data dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Empresa getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Empresa fornecedor) {
		this.fornecedor = fornecedor;
	}
}
