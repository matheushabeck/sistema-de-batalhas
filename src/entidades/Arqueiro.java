package entidades;

public class Arqueiro extends Personagem {

    private double ataqueDistancia;

    public Arqueiro(String nome, double PontosVida, double forca, double defesa){
        super(nome, PontosVida, forca, defesa);
    }

    @Override
    public double atacar() {
        return 0;
    }
}
