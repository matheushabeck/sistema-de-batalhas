package entidades;

public class Guerreiro extends Personagem {

    private double ataqueFisico;

    public Guerreiro(String nome, double PontosVida, double forca, double defesa){
        super(nome, PontosVida, forca, defesa);
    }

    @Override
    public double atacar() {
        return 0;
    }
}
