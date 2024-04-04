package licitacaoApp;

import br.edu.infnet.licitacaoApp.controller.LicitacaoController;
import spark.Spark;

public class App {
	public static void main(String[] args) {
		Spark.port(8080);

		Spark.get("/home", (request, response) -> {
			return App.class.getResourceAsStream("/index.html");
		});

		// Licitacao
		Spark.get("/licitacao/listar/sistema/", LicitacaoController.incluirLicitacoesTeste);
		Spark.get("/licitacao/:id/", LicitacaoController.buscarLicitacao);
		Spark.post("/licitacao/incluir/:nomeLicitacao/", LicitacaoController.incluirLicitacao);
		Spark.post("/licitacao/incluir/", LicitacaoController.incluirLicitacaoJson);
		Spark.delete("/licitacao/:id/excluir/", LicitacaoController.excluirLicitacao);

		// Prefeitura
		Spark.get("/licitacao/:id/prefeitura/", LicitacaoController.obterPrefeitura);
		Spark.post("/licitacao/:id/prefeitura/incluir/:nomePrefeitura/", LicitacaoController.incluirPrefeitura);
		Spark.delete("/licitacao/:id/prefeitura/excluir/:nomePrefeitura/", LicitacaoController.excluirPrefeitura);

		// Chefe de Licitacao
		Spark.get("/licitacao/:id/chefeLicitacao/", LicitacaoController.obterChefeLicitacao);
		Spark.post("/licitacao/:id/chefeLicitacao/incluir/:nomeChefeLicitacao/",
				LicitacaoController.incluirChefeLicitacao);
		Spark.delete("/licitacao/:id/chefeLicitacao/excluir/", LicitacaoController.excluirChefeLicitacao);

		// Data
		Spark.get("/licitacao/:id/data/", LicitacaoController.obterData);
		Spark.post("/licitacao/:id/data/incluir/:dataC/", LicitacaoController.incluirData);
		Spark.delete("/licitacao/:id/data/excluir/:dataC/", LicitacaoController.excluirData);

		// Empresa
		Spark.get("/licitacao/:id/empresas/listar/", LicitacaoController.listarEmpresas);
		Spark.get("/licitacao/:id/buscarEmpresa/:nomeEmpresa/", LicitacaoController.buscarEmpresa);
		Spark.post("/licitacao/:id/empresa/incluir/:nomeEmpresa/", LicitacaoController.incluirEmpresa);
		Spark.delete("/licitacao/:id/nomeEmpresa/excluir/", LicitacaoController.excluirEmpresa);

		// Item
		Spark.get("/licitacao/:id/item/listar/", LicitacaoController.listarItens);
		Spark.get("/licitacao/:id/buscarItem/:nomeItem/", LicitacaoController.buscarItem);
		Spark.post("/licitacao/:id/item/incluir/:nomeItem", LicitacaoController.incluirItem);
		Spark.delete("/licitacao/:id/item/excluir/:nomeItem/", LicitacaoController.excluirItem);
	}
}
