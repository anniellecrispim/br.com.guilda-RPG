package br.com.guilda;

public class Missao {

    private String tituloDaMissao;
    private int dificuldade;
    private Item recompensa;
    private String status;
    private boolean disponivel;

    public Missao(String tituloDaMissao,int dificuldade, Item recompensa) {
        this.setTituloDaMissao(tituloDaMissao);
        this.setDificuldade(dificuldade);
        this.recompensa = recompensa;
        this.status = "Disponível";
        this.setDisponivel(true);
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setTituloDaMissao(String tituloDaMissao) {
        this.tituloDaMissao = tituloDaMissao;
    }

}
