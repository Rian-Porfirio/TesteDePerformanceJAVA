package br.edu.infnet.licitacaoApp.controller;

import com.google.gson.Gson;

import br.edu.infnet.licitacaoApp.model.domain.ChefeLicitacao;
import br.edu.infnet.licitacaoApp.model.domain.Data;
import br.edu.infnet.licitacaoApp.model.domain.Licitacao;
import br.edu.infnet.licitacaoApp.model.domain.Prefeitura;
import br.edu.infnet.licitacaoApp.model.service.LicitacaoService;
import spark.Route;

public class LicitacaoController {
	
	public static Route incluirLicitacoesTeste = (request, response) ->{
		LicitacaoService.incluirLicitacao(new Licitacao("Licitacao 1", new Prefeitura("Prefeitura 1"), new Data("01/01/2024", "10:00"), new ChefeLicitacao("Chefe 1")));
	    LicitacaoService.incluirLicitacao(new Licitacao("Licitacao 2", new Prefeitura("Prefeitura 2"), new Data("02/01/2024", "11:00"), new ChefeLicitacao("Chefe 2")));
	    LicitacaoService.incluirLicitacao(new Licitacao("Licitacao 3", new Prefeitura("Prefeitura 3"), new Data("03/01/2024", "12:00"), new ChefeLicitacao("Chefe 3")));
	    LicitacaoService.incluirLicitacao(new Licitacao("Licitacao 4", new Prefeitura("Prefeitura 4"), new Data("04/01/2024", "13:00"), new ChefeLicitacao("Chefe 4")));
	    LicitacaoService.incluirLicitacao(new Licitacao("Licitacao 5", new Prefeitura("Prefeitura 5"), new Data("05/01/2024", "14:00"), new ChefeLicitacao("Chefe 5")));
		return LicitacaoService.listarLicitacoes();
	};

	public static Route incluirLicitacao = (request, response) -> {
		String nomeLicitacao = request.params("nomeLicitacao");

		Licitacao licitacao = new Licitacao(nomeLicitacao);

		LicitacaoService.incluirLicitacao(licitacao);

		return "Licitacao adicionada nome: " + licitacao;
	};

	public static Route buscarLicitacao = (request, response) -> {
		
		Integer id = Integer.valueOf(request.params("id"));

		return LicitacaoService.buscarLicitacao(id);
	};
	
	public static Route incluirLicitacaoJson = (request, response) -> {

		Licitacao licitacao = new Gson().fromJson(request.body(), Licitacao.class);

		LicitacaoService.incluirLicitacao(licitacao);

		return "Licitacao criada com sucesso nome: " + licitacao;
	};

	public static Route listarEmpresas = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));

		return LicitacaoService.listarEmpresas(id);
	};

	public static Route listarItens = (request, response) -> {
		Integer id = Integer.valueOf(request.params("id"));

		return LicitacaoService.listarItens(id);
	};

	public static Route buscarEmpresa = (request, response) -> {
		Integer id = Integer.valueOf(request.params("id"));

		String nomeEmpresa = request.params("nomeEmpresa");

		return LicitacaoService.buscarEmpresa(id, nomeEmpresa);
	};

	public static Route buscarItem = (request, response) -> {
		Integer id = Integer.valueOf(request.params("id"));

		String nomeItem = request.params("nomeEmpresa");

		return LicitacaoService.buscarItem(id, nomeItem);
	};

	public static Route incluirChefeLicitacao = (request, response) -> {
		Integer id = Integer.valueOf(request.params("id"));

		String nomeChefeLicitacao = request.params("nomeChefeLicitacao");

		LicitacaoService.incluirChefeLicitacao(id, new ChefeLicitacao(nomeChefeLicitacao));

		return "chefe de licitacao incluido com sucesso nome: " + nomeChefeLicitacao;
	};

	public static Route incluirEmpresa = (request, response) -> {
		Integer id = Integer.valueOf(request.params("id"));

		String nomeEmpresa = request.params("nomeEmpresa");

		LicitacaoService.incluirEmpresa(id, nomeEmpresa);

		return "empresa incluida com sucesso nome: " + nomeEmpresa;
	};

	public static Route incluirPrefeitura = (request, response) -> {
		Integer id = Integer.valueOf(request.params("id"));

		String nomePrefeitura = request.params("nomePrefeitura");

		LicitacaoService.incluirPrefeitura(id, new Prefeitura(nomePrefeitura));

		return "prefeitura incluida com sucesso nome: " + nomePrefeitura;
	};

	public static Route incluirData = (request, response) -> {
		Integer id = Integer.valueOf(request.params("id"));

		String dia = request.params("dataD");
		String horas = request.params("dataH");

		LicitacaoService.incluirData(id, new Data(dia, horas));

		return "data incluida com sucesso";
	};

	public static Route incluirItem = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));
		String nomeItem = request.params("nomeItem");

		Licitacao licitacao = LicitacaoService.buscarLicitacao(id);

		LicitacaoService.incluirItem(id, nomeItem);

		return "Item adicionado nome: " + licitacao.getNome() + licitacao.getItem(nomeItem);
	};

	public static Route excluirLicitacao = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));

		LicitacaoService.excluirLicitacao(id);

		return "item excluido";
	};

	public static Route excluirItem = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));

		String nomeItem = request.params("nomeItem");

		LicitacaoService.excluirItem(id, nomeItem);

		return "item excluido";
	};

	public static Route excluirChefeLicitacao = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));

		LicitacaoService.excluirChefeLicitacao(id);

		return "chefe de licitacao excluido";
	};

	public static Route excluirPrefeitura = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));

		LicitacaoService.excluirPrefeitura(id);

		return "prefeitura excluida";
	};

	public static Route excluirData = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));

		LicitacaoService.excluirData(id);

		return "Data excluida";
	};

	public static Route obterPrefeitura = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));

		return LicitacaoService.buscarPrefeitura(id);
	};

	public static Route obterData = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));

		return LicitacaoService.buscarData(id);
	};

	public static Route obterChefeLicitacao = (request, response) -> {

		Integer id = Integer.valueOf(request.params("id"));

		return LicitacaoService.buscarChefeLicitacao(id);
	};

	public static Route excluirEmpresa = (request, response) -> {
		Integer id = Integer.valueOf(request.params("id"));

		String nomeEmpresa = request.params("nomeEmpresa");

		LicitacaoService.excluirEmpresa(id, nomeEmpresa);

		return "empresa excluida";
	};
}
