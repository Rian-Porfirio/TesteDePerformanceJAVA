package SistemaLavaRoupas.system;

import SistemaLavaRoupas.Clientes.ClienteAssinatura;

public class Gerente extends Funcionario {
    public Gerente(String nome, String sobrenome, String cadastroFuncionario, double salario) {
        super(nome, sobrenome, cadastroFuncionario, salario);
    }
    public void cadastrarClienteAssinatura(ClienteAssinatura cliente){
        SistemaClientes.listaClientes.add(cliente);
    }
}
