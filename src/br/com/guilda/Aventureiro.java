package br.com.guilda;
import java.util.ArrayList;

public class Aventureiro extends Pessoa {

    private String numeroDeRegistro;
    private String primeiraSkill;
    private String segundaSkill;
    private String terceiraSkill;
    private String quartaSkill;
    private String ultimateSkill;
    private Missao atualMissao;
    private int rank;
    private ArrayList<Item> bolsa;
    //private Classe classe;

    public Aventureiro(String nome, String genero, int idade, double altura,
                       String numeroDeRegistro, String primeiraSkill, String segundaSkill,
                       String terceiraSkill, String quartaSkill, String ultimateSkill) {

        super(nome, genero, idade, altura);
        this.numeroDeRegistro = numeroDeRegistro;
        this.primeiraSkill = primeiraSkill;
        this.segundaSkill = segundaSkill;
        this.terceiraSkill = terceiraSkill;
        this.quartaSkill = quartaSkill;
        this.ultimateSkill = ultimateSkill;
        this.atualMissao = null;
        this.rank = 1;
        this.bolsa = new ArrayList();

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
}
