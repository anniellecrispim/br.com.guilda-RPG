package br.com.guilda;
import java.util.ArrayList;

public class Aventureiro extends Pessoa {

    private int numeroDeRegistro;
    private String primeiraSkill;
    private String segundaSkill;
    private String terceiraSkill;
    private String quartaSkill;
    private String ultimateSkill;
    private Missao atualMissao;
    private int rank;
    private ArrayList <ItemClasse> bolsa;



    public Aventureiro(String nome, String genero, int idade, double altura,
                       int numeroDeRegistro, String primeiraSkill, String segundaSkill,
                       String terceiraSkill, String quartaSkill, String ultimateSkill){

        super(nome, genero, idade, altura);
        this.numeroDeRegistro 	= numeroDeRegistro;
        this.setPrimeiraSkill(primeiraSkill);
        this.setSegundaSkill(segundaSkill);
        this.setTerceiraSkill(terceiraSkill);
        this.setQuartaSkill(quartaSkill);
        this.setUltimateSkill(ultimateSkill);
        this.atualMissao 		= null;
        this.rank 				= 1;
        this.bolsa				= new ArrayList<ItemClasse>();

    }

    public String iniciarMissao(Missao novaMissao) {
        if(this.rank >= novaMissao.getDificuldade() && novaMissao.getDisponivel() == true) {
            this.atualMissao = novaMissao;
            this.atualMissao.iniciarMissao();
            return "Missão aceita.";
        } else if(this.rank < novaMissao.getDificuldade()) {
            return "A missão é muito difícil para você agora";
        } else if(novaMissao.getDisponivel() != true) {
            return "Já tem alguém fazendo essa missão";
        }
        return "erro, opção inválida";
    }

    public String fracassarMissao() {
        this.atualMissao.falharMissao();
        return "Você não conseguiu concluir a missão.";

    }

    public String concluirMissao() {
        this.bolsa.add(this.atualMissao.concluirMissao());
        return "Parabéns, você concluiu a missão e ganhou "+ this.atualMissao.getRecompensa();
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPrimeiraSkill() {
        return primeiraSkill;
    }

    public void setPrimeiraSkill(String primeiraSkill) {
        this.primeiraSkill = primeiraSkill;
    }

    public String getSegundaSkill() {
        return segundaSkill;
    }

    public void setSegundaSkill(String segundaSkill) {
        this.segundaSkill = segundaSkill;
    }

    public String getTerceiraSkill() {
        return terceiraSkill;
    }

    public void setTerceiraSkill(String terceiraSkill) {
        this.terceiraSkill = terceiraSkill;
    }

    public String getQuartaSkill() {
        return quartaSkill;
    }

    public void setQuartaSkill(String quartaSkill) {
        this.quartaSkill = quartaSkill;
    }

    public String getUltimateSkill() {
        return ultimateSkill;
    }

    public void setUltimateSkill(String ultimateSkill) {
        this.ultimateSkill = ultimateSkill;
    }
}