package br.edu.infnet.licitacaoApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.licitacaoApp.model.domain.ChefeLicitacao;
import br.edu.infnet.licitacaoApp.model.domain.Data;
import br.edu.infnet.licitacaoApp.model.domain.Empresa;
import br.edu.infnet.licitacaoApp.model.domain.Item;
import br.edu.infnet.licitacaoApp.model.domain.Licitacao;
import br.edu.infnet.licitacaoApp.model.domain.Prefeitura;

public class LicitacaoService {

	private static Map<Integer, Licitacao> licitacoes = new HashMap<Integer, Licitacao>();

	private static Integer id = 0;

	public static void incluirLicitacao(Licitacao licitacao) {

		licitacao.setId(++id);

		licitacoes.put(licitacao.getId(), licitacao);
	}

	public static Collection<Licitacao> listarLicitacoes() {
		return licitacoes.values();
	}

	public static void incluirPrefeitura(Integer idLicitacao, Prefeitura prefeitura) {
		licitacoes.get(idLicitacao).setPrefeitura(prefeitura);
	}

	public static void incluirChefeLicitacao(Integer idLicitacao, ChefeLicitacao chefeLicitacao) {
		licitacoes.get(idLicitacao).setChefeLicitacao(chefeLicitacao);
	}

	public static void incluirData(Integer idLicitacao, Data data) {
		licitacoes.get(idLicitacao).setData(data);
	}

	public static void incluirItem(Integer idLicitacao, String nomeItem) {
		licitacoes.get(idLicitacao).setItem(nomeItem);
	}

	public static void excluirItem(Integer idLicitacao, String nomeItem) {
		licitacoes.get(idLicitacao).deleteItem(nomeItem);
	}

	public static Collection<Item> listarItens(Integer idLicitacao) {
		return licitacoes.get(idLicitacao).getItens();
	}

	public static void incluirEmpresa(Integer idLicitacao, String nomeEmpresa) {
		try {
			Licitacao licitacao = licitacoes.get(idLicitacao);
			System.out.println(licitacao);
			licitacao.setEmpresa(nomeEmpresa);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public static Collection<Empresa> listarEmpresas(Integer idLicitacao) {
		return licitacoes.get(idLicitacao).getEmpresas();
	}

	public static Empresa buscarEmpresa(Integer idLicitacao, String nomeEmpresa) {
		return licitacoes.get(idLicitacao).getEmpresa(nomeEmpresa);
	}

	public static Item buscarItem(Integer idLicitacao, String nomeItem) {
		return licitacoes.get(idLicitacao).getItem(nomeItem);
	}

	public static void excluirEmpresa(Integer idLicitacao, String nomeEmpresa) {
		licitacoes.get(idLicitacao).deleteEmpresa(nomeEmpresa);
	}

	public static void excluirLicitacao(Integer idLicitacao) {
		licitacoes.remove(idLicitacao);
	}

	public static void excluirChefeLicitacao(Integer idLicitacao) {
		licitacoes.get(idLicitacao).setChefeLicitacao(null);
	}

	public static void excluirPrefeitura(Integer idLicitacao) {
		licitacoes.get(idLicitacao).setPrefeitura(null);
	}

	public static void excluirData(Integer idLicitacao) {
		licitacoes.get(idLicitacao).setData(null);
	}

	public static Prefeitura buscarPrefeitura(Integer id) {
		return licitacoes.get(id).getPrefeitura();
	}
	
	public static Data buscarData(Integer id) {
		return licitacoes.get(id).getData();
	}
	
	public static ChefeLicitacao buscarChefeLicitacao(Integer id) {
		return licitacoes.get(id).getChefeLicitacao();
	}
	
	public static Licitacao buscarLicitacao(Integer id) {
		return licitacoes.get(id);
	}
}
