package SistemaLavaRoupas.system;

public class LavaRoupas {
    private String nomeMaquina;
    private final float capacidadeLitros = 5;
    private double aluguelMaquina = 1;
    private int tempoLavagem;

    public LavaRoupas(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }

    public String getNomeMaquina() {
        return nomeMaquina;
    }

    private void setNomeMaquina(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }

    public float getCapacidade() {
        return capacidadeLitros ;
    }

    public double getAluguelMaquina() {
        return aluguelMaquina;
    }

    private void setAluguelMaquina(double aluguelMaquina) {
        this.aluguelMaquina = aluguelMaquina;
    }

    public int getTempoLavagem() {
        return tempoLavagem;
    }

    public String setTempoLavagem(double dinheiroAluguel) {
        this.tempoLavagem = (int) (getAluguelMaquina() * dinheiroAluguel);
        return "O tempo dedicado para a lavagem da sua roupa será de: " + this.getTempoLavagem() + " minutos";
    }

    public String setTempoLavagemAssinatura(){
        this.tempoLavagem = 120;

        return "O tempo dedicado para a lavagem da sua roupa será de: " + this.getTempoLavagem() +
                " minutos e as roupas serão secadas e dobradas logo após";
    }
}
