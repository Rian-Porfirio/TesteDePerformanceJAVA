package TestAPP;

import SistemaLavaRoupas.Clientes.ClienteAssinatura;
import SistemaLavaRoupas.system.Gerente;
import SistemaLavaRoupas.system.SistemaClientes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SistemaTest {
    @Test
    public void testeSistemaMaquinaDeLavarRoupas(){
        testeParaLocalizarClientesAssinaturaCadastradosPeloGerente();
        testeParaCompararGastosClientesAssinaturaClientesComumSistemaMaquina();
    }

    private void testeParaCompararGastosClientesAssinaturaClientesComumSistemaMaquina() {
        assertEquals(", com um total de " + 10 + " lavagens por mês e um tempo mínimo de uso de " + 20 +
                " minutos, você está gastando um total de: R$" + 200 + " \n enquanto um assinante dos nossos serviços" +
                " gasta R$120 e garante que sua roupa estará limpa, cheirosa, seca e dobrada toda semana.", SistemaClientes.compararGastos(10, 20));
    }

    private void testeParaLocalizarClientesAssinaturaCadastradosPeloGerente() {
        new Gerente().cadastrarClienteAssinatura(new ClienteAssinatura("132TesteCliente"));
        assertTrue(SistemaClientes.buscarCliente("132TesteCliente"));
    }
}
