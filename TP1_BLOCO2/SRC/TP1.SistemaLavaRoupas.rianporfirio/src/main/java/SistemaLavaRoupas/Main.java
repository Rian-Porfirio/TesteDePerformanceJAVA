package SistemaLavaRoupas;

import SistemaLavaRoupas.Clientes.ClienteAssinatura;
import SistemaLavaRoupas.Clientes.ClienteComum;
import SistemaLavaRoupas.adm.Funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Odair",
                "Santos",
                "123OdairSantos321",
                2600);

        ClienteComum cliente1 = new ClienteComum("Holigar", "silva", "(11)99392-9939", 34, 20);
        ClienteAssinatura clienteAssinatura1 = new ClienteAssinatura("Otavio", "santos", "(11)99293-9929", 25, 20, "otavio123Santos0132");


        System.out.println(funcionario1.utilizarLavaRoupas("maquina032", cliente1.getValor(), false));
        System.out.println(funcionario1.utilizarLavaRoupas("maquina001", 0, true));
    }
}
