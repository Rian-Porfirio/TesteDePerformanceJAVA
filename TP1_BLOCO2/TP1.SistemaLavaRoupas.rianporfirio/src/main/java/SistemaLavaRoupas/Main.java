package SistemaLavaRoupas;

import SistemaLavaRoupas.Clientes.ClienteAssinatura;
import SistemaLavaRoupas.Clientes.ClienteComum;
import SistemaLavaRoupas.system.Funcionario;
import SistemaLavaRoupas.system.Gerente;
import SistemaLavaRoupas.system.SistemaClientes;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Odair",
                "Santos",
                "123OdairSantos321",
                2600);
        Gerente gerente = new Gerente("aldacio",
                "Santantonio",
                "aldacioGerenteSantantonio312",
                5500);

        ClienteComum cliente1 = new ClienteComum("Holigar", "silva", "(11)99392-9939", 34, 20);
        ClienteComum cliente2 = new ClienteComum("Maurecio", "silva", "(11)99332-9939", 34, 50);
        ClienteAssinatura clienteAssinatura1 = new ClienteAssinatura("outio", "tenis", "(11)99623-9929", 25, 20, "outio13tenis0132");
        ClienteAssinatura clienteAssinatura2 = new ClienteAssinatura("camila", "pingpong", "(18)99233-9929", 25, 20, "camila123pingpong02");
        ClienteAssinatura clienteAssinatura3 = new ClienteAssinatura("carlito", "telefone", "(11)99200-9929", 25, 20, "carlito123telefone");

        //cadastro clientes assinantes
        gerente.cadastrarClienteAssinatura(clienteAssinatura1);
        gerente.cadastrarClienteAssinatura(clienteAssinatura2);
        gerente.cadastrarClienteAssinatura(clienteAssinatura3);

        //Funcionamento das máquinas por clientes assinantes
        System.out.println(clienteAssinatura1.getNome() + funcionario.utilizarLavaRoupasAssinatura(clienteAssinatura1.getCadastroAssinatura(), "Maquina001"));
        System.out.println("-----------");
        System.out.println(clienteAssinatura2.getNome() + funcionario.utilizarLavaRoupasAssinatura(clienteAssinatura2.getCadastroAssinatura(),"Maquina002"));
        System.out.println("-----------");

        //Funcionamento das maquinas por clientes comuns
        System.out.println(cliente1.getNome() + funcionario.utilizarLavaRoupasComum("Maquina004", cliente1.getValor()));
        System.out.println("-----------");

        //teste valor aluguel menor que zero
        System.out.println(funcionario.utilizarLavaRoupasComum("Maquina005", -20));
        System.out.println("-----------");

        //teste código errado
        System.out.println(funcionario.utilizarLavaRoupasAssinatura("CodigoTeste", "Maquina003"));
        System.out.println("-----------");

        //Calculo de gastos não assinantes
        System.out.println(cliente1.getNome() + SistemaClientes.compararGastos(10, 30));
    }
}
