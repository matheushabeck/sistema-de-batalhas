package entidades;

public abstract class Personagem {

    private String nome;
    private double pontosVida;
    private double forca;
    private double defesa;

    public Personagem(String nome, double pontosVida, double forca, double defesa){
        this.defesa = defesa;
        this.pontosVida = pontosVida;
        this.forca = forca;
        this.defesa = defesa;
    }

    public abstract double atacar();
}
