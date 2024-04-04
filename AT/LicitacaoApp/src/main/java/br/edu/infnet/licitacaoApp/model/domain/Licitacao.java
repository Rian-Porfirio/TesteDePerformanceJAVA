package br.edu.infnet.licitacaoApp.model.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Licitacao {

	private Integer id;

	private String nome;
	private Map<String, Item> itens = new HashMap<>();
	private Map<String, Empresa> empresas = new HashMap<>();
	private Prefeitura prefeitura;
	private Data data;
	private ChefeLicitacao chefeLicitacao;

	@Override
	public String toString() {
		return getNome() + " " + getPrefeitura() + " " + getChefeLicitacao() + " Id: " + getId();
	}

	public Licitacao(String nome) {
		this.nome = nome;
	}
	
	public Licitacao(String nome, Prefeitura prefeitura, Data data, ChefeLicitacao chefeLicitacao) {
		this.nome = nome;
		this.prefeitura = prefeitura;
		this.data = data;
		this.chefeLicitacao = chefeLicitacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarItem(String nomeItem, Item item) {
		itens.put(nomeItem, item);
	}

	public Item getItem(String nomeItem) {
		return itens.get(nomeItem);
	}

	public void setItem(String nomeItem) {
		itens.put(nomeItem, new Item(nomeItem));
	}

	public Collection<Item> getItens() {
		return itens.values();
	}

	public Collection<Empresa> getEmpresas() {
		return empresas.values();
	}

	public Empresa getEmpresa(String nomeEmpresa) {
		return empresas.get(nomeEmpresa);
	}

	public void setEmpresa(String nomeEmpresa) {
		empresas.put(nomeEmpresa, new Empresa(nomeEmpresa));
	}

	public Prefeitura getPrefeitura() {
		return prefeitura;
	}

	public void setPrefeitura(Prefeitura prefeitura) {
		this.prefeitura = prefeitura;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public ChefeLicitacao getChefeLicitacao() {
		return chefeLicitacao;
	}

	public void setChefeLicitacao(ChefeLicitacao chefeLicitacao) {
		this.chefeLicitacao = chefeLicitacao;
	}

	public void deleteItem(String nomeItem) {
		itens.remove(nomeItem);
	}

	public void deleteEmpresa(String nomeEmpresa) {
		empresas.remove(nomeEmpresa);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
