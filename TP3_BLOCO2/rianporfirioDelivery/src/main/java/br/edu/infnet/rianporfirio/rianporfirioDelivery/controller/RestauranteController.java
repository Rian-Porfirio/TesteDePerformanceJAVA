package br.edu.infnet.rianporfirio.rianporfirioDelivery.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Entregador;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Funcionario;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.service.RestauranteService;

@RestController
@RequestMapping("/api/restaurante")
public class RestauranteController {

	@Autowired
	private RestauranteService restauranteService;

	@PostMapping(value = "/incluir/entregador/{entregador}")
	public void incluirEntregador(@PathVariable Entregador entregador) {
		restauranteService.incluirEntregador(entregador);
	}

	@PostMapping(value = "/incluir/funcionario/{funcionario}")
	public void incluirFuncionario(@PathVariable Funcionario funcionario) {
		restauranteService.incluirFuncionario(funcionario);
	}

	@DeleteMapping(value ="/excluir/entregador/{nomeEntregador}")
	public void excluirEntregador(@PathVariable String nomeEntregador) {
		restauranteService.excluirEntregador(nomeEntregador);
	}

	@DeleteMapping(value ="/excluir/funcionario/{nomeFuncionario}")
	public void excluirFuncionario(@PathVariable String nomeFuncionario) {
		restauranteService.excluirFuncionario(nomeFuncionario);
	}

	@GetMapping(value = "/entregador/listar")
	public Collection<Entregador> obterListaEntregadores() {
		return restauranteService.obterListaEntregadores();
	}

	@GetMapping(value = "/funcionario/listar")
	public Collection<Funcionario> obterListaFuncionarios() {
		return restauranteService.obterListaFuncionarios();
	}

	@GetMapping(value = "/entregador/{nomeEntregador}")
	public Entregador obterEntregador(@PathVariable String nomeEntregador) {
		return restauranteService.obterEntregador(nomeEntregador);
	}

	@GetMapping(value = "/funcionario/{nomeFuncionario}")
	public Funcionario obterFuncionario(@PathVariable String nomeFuncionario) {
		return restauranteService.obterFuncionario(nomeFuncionario);
	}
}
