package SistemaLavaRoupas.system;

import SistemaLavaRoupas.Clientes.ClienteAssinatura;

import java.util.ArrayList;
import java.util.List;

public class SistemaClientes {
    protected static List<ClienteAssinatura> listaClientes = new ArrayList<>();
    protected static boolean buscarCliente(String cadastroAssinatura){

        for(ClienteAssinatura cliente : listaClientes) {
            if (cliente.cadastroAssinatura == cadastroAssinatura)
                return true;
        }
        return false;
    }
    public static String compararGastos(int quantidadeLavagens, int tempoMinimo){
        return ", com um total de " + quantidadeLavagens + " lavagens por mês e um tempo mínimo de uso de " + tempoMinimo +
        " minutos, você está gastando um total de: R$" + quantidadeLavagens * tempoMinimo + " \n enquanto um assinante dos nossos serviços" +
                " gasta R$120 e garante que sua roupa estará limpa, cheirosa, seca e dobrada toda semana.";
    }
}
