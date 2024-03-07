package TestAPP;

import SistemaLavaRoupas.Clientes.ClienteAssinatura;
import SistemaLavaRoupas.system.Funcionario;
import SistemaLavaRoupas.system.Gerente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GerenteTest {
    Gerente gerente = new Gerente();
    ClienteAssinatura clienteTeste = new ClienteAssinatura();
    @Test
    public void testesParaChecarSeGerenteEstaCorretamenteInserido(){
        testeNomeGerenteCorretamenteEscrito();
        testeSalarioGerenteCorretamenteInserido();
        testeCadastroGerenteCorretamenteInserido();
        testeCadastroClientesAssinaturaGerenteCorretamenteInserido();
    }
    private void testeCadastroClientesAssinaturaGerenteCorretamenteInserido() {
        clienteTeste.setCadastroAssinatura("132TesteCliente");
        gerente.cadastrarClienteAssinatura(clienteTeste);
    }

    private void testeCadastroGerenteCorretamenteInserido(){
        gerente.setCadastroFuncionario("123SilvaVanderley123");
        assertEquals("123SilvaVanderley123", gerente.getCadastroFuncionario());
    }

    private void testeSalarioGerenteCorretamenteInserido() {
        gerente.setSalario(5500);
        assertEquals(5500,gerente.getSalario(), 0.1);
    }

    private void testeNomeGerenteCorretamenteEscrito() {
        gerente.setNome("Vanderley");
        gerente.setSobrenome("Silva");
        assertEquals("Vanderley", gerente.getNome());
        assertEquals("Silva",gerente.getSobrenome());
    }
}
