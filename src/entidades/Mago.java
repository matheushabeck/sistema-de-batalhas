package entidades;

public class Mago extends Personagem {

    private double ataqueMagico;

    public Mago(String nome, double PontosVida, double forca, double defesa){
        super(nome, PontosVida, forca, defesa);
    }

    @Override
    public double atacar() {
        return 0;
    }
}
