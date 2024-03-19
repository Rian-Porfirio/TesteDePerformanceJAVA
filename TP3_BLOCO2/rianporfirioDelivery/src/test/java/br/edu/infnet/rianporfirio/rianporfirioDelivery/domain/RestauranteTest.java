package br.edu.infnet.rianporfirio.rianporfirioDelivery.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Endereco;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Entregador;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Funcionario;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Restaurante;

@SpringBootTest
class RestauranteTest {

	private Restaurante restaurante;
	private Funcionario funcionario = new Funcionario();
	private Entregador entregador = new Entregador();

	private final String NOME = "Sandes";
	private final String DESCRICAO = "Hamburguer de verdade";
	private final Endereco ENDERECO = new Endereco("36570083", "Rua Cesar Santana", null, "Centro", "Viçosa", "MG");

	@BeforeEach
	void testeSetandoDadosRestaurante() {
		restaurante = new Restaurante();
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(funcionario);

		List<Entregador> entregadores = new ArrayList<Entregador>();
		entregadores.add(entregador);

		restaurante.setEntregadores(entregadores);
		restaurante.setFuncionarios(funcionarios);
		restaurante.setDescricao(DESCRICAO);
		restaurante.setEndereco(ENDERECO);
		restaurante.setNome(NOME);
	}

	@Test
	void testeRecuperandoDadosRestaurante() {
		assertEquals(NOME, restaurante.getNome());
		assertEquals(DESCRICAO, restaurante.getDescricao());
		assertEquals(ENDERECO, restaurante.getEndereco());
		assertTrue(restaurante.getFuncionarios().contains(funcionario));
		assertTrue(restaurante.getEntregadores().contains(entregador));
	}
}
