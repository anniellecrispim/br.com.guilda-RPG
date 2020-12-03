package br.com.guilda;

public class Missao {

    private String tituloDaMissao;
    private int dificuldade;
    private ItemClasse recompensa;
    private String status;
    private boolean disponivel;
    private int numeroMissao;


    public Missao(String tituloDaMissao,int dificuldade, ItemClasse recompensa, int numeroMissao) {
        this.setTituloDaMissao(tituloDaMissao);
        this.setDificuldade(dificuldade);
        this.recompensa = (ItemClasse) recompensa;
        this.status = "Disponível";
        this.setDisponivel(true);
        this.numeroMissao = numeroMissao;
    }


    public void iniciarMissao() {
        this.status = "Em andamento.";
        this.setDisponivel(false);
    }

    public void falharMissao() {
        this.status = "Não Concluida";
        this.setDisponivel(true);
    }

    public ItemClasse concluirMissao() {
        this.status = "Conluida";
        this.setDisponivel(false);
        return this.recompensa;
    }


    public boolean getDisponivel() {
        return disponivel;
    }


    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public ItemClasse getRecompensa() {
        return recompensa;
    }

    public String getStatus() {
        return status;
    }

    public void setTituloDaMissao(String tituloDaMissao) {
        this.tituloDaMissao = tituloDaMissao;
    }

    public int getNumeroMissao() {
        return numeroMissao;
    }

    private String getTituloDaMissao() {
        return tituloDaMissao;
    }

    public String toString() {
        return "O nome da Missão é " + this.getTituloDaMissao()
                + " com dificuldade " + this.getDificuldade()
                + " e a recompensa é" + this.getRecompensa() ;
    }
}
