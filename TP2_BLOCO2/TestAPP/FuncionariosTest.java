package TestAPP;

import SistemaLavaRoupas.system.Funcionario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuncionariosTest {
    Funcionario funcionario = new Funcionario();

    @Test
    public void testesParaChecarSeFuncionarioEstaCorretamenteInserido(){
        testeNomeFuncionarioCorretamenteEscrito();
        testeSalarioFuncionarioCorretamenteInserido();
        testeCadastroFuncionarioCorretamenteInserido();
    }

    private void testeCadastroFuncionarioCorretamenteInserido(){
        funcionario.setCadastroFuncionario("123SilvaVanderley123");
        assertEquals("123SilvaVanderley123", funcionario.getCadastroFuncionario());
    }

    private void testeSalarioFuncionarioCorretamenteInserido() {
        funcionario.setSalario(2500);
        assertEquals(2500, funcionario.getSalario(), 0.1);
    }

    private void testeNomeFuncionarioCorretamenteEscrito() {
        funcionario.setNome("Vanderley");
        funcionario.setSobrenome("Silva");
        assertEquals("Vanderley", funcionario.getNome());
        assertEquals("Silva", funcionario.getSobrenome());
    }
}
