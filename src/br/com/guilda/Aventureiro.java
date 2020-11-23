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
}
