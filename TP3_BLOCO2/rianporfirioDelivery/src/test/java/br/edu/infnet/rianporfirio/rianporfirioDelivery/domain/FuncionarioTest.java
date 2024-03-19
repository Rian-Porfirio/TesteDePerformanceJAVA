package br.edu.infnet.rianporfirio.rianporfirioDelivery.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Funcionario;
import br.edu.infnet.rianporfirio.rianporfirioDelivery.model.domain.Restaurante;

@SpringBootTest
class FuncionarioTest {
	private Funcionario funcionario;

	private final String NOME = "Felipp";
	private final String SOBRENOME = "Ewber";
	private final int IDADE = 20;
	private final float SALARIO = 2000;
	private final Restaurante RESTAURANTE = new Restaurante("Sandes");

	@BeforeEach
	void testeSetandoDadosFuncionario() {
		funcionario = new Funcionario();
		funcionario.setIdade(IDADE);
		funcionario.setNome(NOME);
		funcionario.setSalario(SALARIO);
		funcionario.setSobrenome(SOBRENOME);
		funcionario.setRestaurante(RESTAURANTE);
	}

	@Test
	void testeRecuperandoDadosFuncionario() {
		assertEquals(IDADE, funcionario.getIdade());
		assertEquals(NOME, funcionario.getNome());
		assertEquals(SALARIO, funcionario.getSalario());
		assertEquals(SOBRENOME, funcionario.getSobrenome());
		assertEquals(RESTAURANTE, funcionario.getRestaurante());
	}
}
