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

    public void iniciarMissao() {
        this.status = "Em andamento.";
        this.setDisponivel(false);
    }

    public void falharMissao() {
        this.status = "Não Concluida";
        this.setDisponivel(true);
    }

    public Item concluirMissao() {
        this.status = "Conluida";
        this.setDisponivel(false);
        return this.recompensa;
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

    public Item getRecompensa() {
        return recompensa;
    }

    public String getStatus() {
        return status;
    }
    public void setTituloDaMissao(String tituloDaMissao) {
        this.tituloDaMissao = tituloDaMissao;
    }

}
