package SistemaLavaRoupas.Clientes;

public class ClienteAssinatura extends ClienteComum{
    private String cadastroAssinatura;
    public ClienteAssinatura(String nome, String sobrenome, String telefone, int idade, int valor, String cadastroAssinatura) {
        super(nome, sobrenome, telefone, idade, valor);
        this.cadastroAssinatura = cadastroAssinatura;
    }

    private String getCadastroAssinatura(){
        return cadastroAssinatura;
    }
    private void setCadastroAssinatura(String cadastroAssinatura){
        this.cadastroAssinatura = cadastroAssinatura;
    }
}
