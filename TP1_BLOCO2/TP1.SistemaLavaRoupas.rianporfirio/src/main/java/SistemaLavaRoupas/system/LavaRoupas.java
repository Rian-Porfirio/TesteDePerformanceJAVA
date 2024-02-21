package SistemaLavaRoupas.system;

public class LavaRoupas {
    private String nomeMaquina;
    private final float capacidadeLitros = 5;
    private double aluguelMaquina = 1;
    private int tempoLavagem;

    protected LavaRoupas(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }
    protected String getNomeMaquina() {
        return nomeMaquina;
    }
    protected void setNomeMaquina(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }
    protected float getCapacidade() {
        return capacidadeLitros ;
    }
    protected double getAluguelMaquina() {
        return aluguelMaquina;
    }
    protected void setAluguelMaquina(double aluguelMaquina) {
        this.aluguelMaquina = aluguelMaquina;
    }
    protected int getTempoLavagem() {
        return tempoLavagem;
    }

    protected String setTempoLavagem(double dinheiroAluguel) {
        this.tempoLavagem = (int) (getAluguelMaquina() * dinheiroAluguel);
        return ", o tempo dedicado para a lavagem da sua roupa será de: " + this.getTempoLavagem() + " minutos";
    }

    protected String setTempoLavagemAssinatura(){
        this.tempoLavagem = 120;

        return ", o tempo dedicado para a lavagem da sua roupa será de: " + this.getTempoLavagem() +
                " minutos e as roupas serão secadas e dobradas logo após";
    }
}
