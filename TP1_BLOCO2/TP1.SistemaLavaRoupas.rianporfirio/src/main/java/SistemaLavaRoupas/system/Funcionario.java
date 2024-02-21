package SistemaLavaRoupas.system;

import SistemaLavaRoupas.system.LavaRoupas;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cadastroFuncionario;
    private double salario;

    public Funcionario(String nome, String sobrenome, String cadastroFuncionario, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cadastroFuncionario = cadastroFuncionario;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    protected void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCadastroFuncionario() {
        return cadastroFuncionario;
    }
    protected void setCadastroFuncionario(String cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }
    public double getSalario() {
        return salario;
    }
    protected void setSalario(double salario) {
        this.salario = salario;
    }
    public String utilizarLavaRoupasAssinatura(String codigoAssinatura, String nomeMaquina){
            LavaRoupas maquina = new LavaRoupas(nomeMaquina);

        if(SistemaClientes.buscarCliente(codigoAssinatura)){
            return maquina.setTempoLavagemAssinatura();
        }
        return "Código não encontrado";
    }

    public String utilizarLavaRoupasComum(String nomeMaquina, double valorAluguel){
            LavaRoupas maquina = new LavaRoupas(nomeMaquina);
        if(valorAluguel <= 0){
            return "Houve um erro ao utilizar a maquina";
        }
        return maquina.setTempoLavagem(valorAluguel);
    }
}
