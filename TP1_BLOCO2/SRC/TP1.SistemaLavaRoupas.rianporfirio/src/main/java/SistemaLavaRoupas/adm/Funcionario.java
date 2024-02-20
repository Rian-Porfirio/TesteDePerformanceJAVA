package SistemaLavaRoupas.adm;

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

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    private void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCadastroFuncionario() {
        return cadastroFuncionario;
    }

    private void setCadastroFuncionario(String cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public String utilizarLavaRoupas(String nomeMaquina, double valorAluguel, boolean isAssinante){

        LavaRoupas lavaRoupas = new LavaRoupas(nomeMaquina);

        if(isAssinante){
            return lavaRoupas.setTempoLavagemAssinatura();
        }
        return lavaRoupas.setTempoLavagem(valorAluguel);
    }
}
