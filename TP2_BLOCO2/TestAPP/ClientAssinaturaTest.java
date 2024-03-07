package TestAPP;

import SistemaLavaRoupas.Clientes.ClienteAssinatura;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientAssinaturaTest {
    ClienteAssinatura clienteAssinatura = new ClienteAssinatura();
    @Test
    public void testesParaChecarSeClienteAssinaturaEstaCorretamenteInserido(){
        testeNomeClienteAssinaturaCorretamenteEscrito();
        testeTelefoneClienteAssinaturaCorretamenteInserido();
        testeCadastroClienteAssinaturaCorretamenteInserido();
        testeIdadeClienteAssinaturaCorretamenteInserido();
    }

    private void testeIdadeClienteAssinaturaCorretamenteInserido() {
        clienteAssinatura.setIdade(25);
        assertEquals(25, clienteAssinatura.getIdade());
    }

    private void testeCadastroClienteAssinaturaCorretamenteInserido(){
        clienteAssinatura.setCadastroAssinatura("321SilvaVanderley321");
        assertEquals("321SilvaVanderley321", clienteAssinatura.getCadastroAssinatura());
    }

    private void testeTelefoneClienteAssinaturaCorretamenteInserido() {
        clienteAssinatura.setTelefone("119962516494");
        assertEquals("119962516494", clienteAssinatura.getTelefone());
    }

    private void testeNomeClienteAssinaturaCorretamenteEscrito() {
        clienteAssinatura.setNome("Vanderley");
        clienteAssinatura.setSobrenome("Silva");
        assertEquals("Vanderley", clienteAssinatura.getNome());
        assertEquals("Silva", clienteAssinatura.getSobrenome());
    }
}
