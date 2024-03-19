package br.edu.infnet.rianporfirio.rianporfirioDelivery.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Entregador;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Restaurante;

@SpringBootTest
 class EntregadorTest {

	private Entregador entregador;
	private Restaurante restaurante = new Restaurante();

	private final String NOME = "Markin";
	private final String SOBRENOME = "Silva";
	private final int IDADE = 23;
	private final int CODIGOENTREGADOR = 123;
	private final float SALARIO = 2000;

	@BeforeEach
	void testeSetandoDadosEntregador() {

		entregador = new Entregador();

		entregador.setCodigoEntregador(CODIGOENTREGADOR);
		entregador.setNome(NOME);
		entregador.setRestaurante(restaurante);
		entregador.setSalario(SALARIO);
		entregador.setIdade(IDADE);
		entregador.setSobrenome(SOBRENOME);

		restaurante.setValorCorrida(20);
	}

	@Test
	void testeRecuperandoDadosEntregador() {
		assertEquals(NOME, entregador.getNome());
		assertEquals(SOBRENOME, entregador.getSobrenome());
		assertEquals(SALARIO, entregador.getSalario());
		assertEquals(IDADE, entregador.getIdade());
		assertEquals(CODIGOENTREGADOR, entregador.getCodigoEntregador());
		assertEquals(3000, entregador.calculoSalarioTotal(50));
		assertEquals(restaurante, entregador.getRestaurante());
	}
}
