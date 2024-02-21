package SistemaLavaRoupas.Clientes;

public class ClienteAssinatura extends ClienteComum{
    public String cadastroAssinatura;
    public ClienteAssinatura(String nome, String sobrenome, String telefone, int idade, int valor, String cadastroAssinatura) {
        super(nome, sobrenome, telefone, idade, valor);
        this.cadastroAssinatura = cadastroAssinatura;
    }
    public String getCadastroAssinatura(){
        return cadastroAssinatura;
    }
}
