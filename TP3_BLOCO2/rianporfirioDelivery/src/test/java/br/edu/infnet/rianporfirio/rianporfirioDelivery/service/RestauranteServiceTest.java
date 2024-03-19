package br.edu.infnet.rianporfirio.rianporfirioDelivery.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Entregador;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Funcionario;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.service.RestauranteService;

@SpringBootTest
public class RestauranteServiceTest {

	RestauranteService restauranteService;
	Entregador entregador = new Entregador("Joao");
	Funcionario funcionario = new Funcionario("Joaquim");

	@BeforeEach
	void testeInserindoDadosRestauranteService() {
		restauranteService = new RestauranteService();

		restauranteService.incluirEntregador(entregador);
		restauranteService.incluirFuncionario(funcionario);
	}
	
	@Test
	void testeObterListaRestauranteService() {
		assertTrue(restauranteService.obterListaEntregadores().contains(entregador));
		assertTrue(restauranteService.obterListaFuncionarios().contains(funcionario));
		assertEquals(entregador, restauranteService.obterEntregador(entregador.getNome()));
		assertEquals(funcionario, restauranteService.obterFuncionario(funcionario.getNome()));
	}
	
	@Test
	void testeExcluirDadosRestauranteService() {
		restauranteService.excluirEntregador(entregador.getNome());
		restauranteService.excluirFuncionario(funcionario.getNome());
		
		assertEquals(null, restauranteService.obterEntregador(entregador.getNome()));
		assertEquals(null, restauranteService.obterFuncionario(funcionario.getNome()));
	}
}
