package br.com.guilda;

public class Aventureiro {

    private String numeroDeRegistro;
    private String primeiraSkill;
    private String segundaSkill;
    private String terceiraSkill;
    private String quartaSkill;
    private String ultimateSkill;
    //private Itens Bolsa [];

    //Falta Rank e Missao

    public Aventureiro(String numeroDeRegistro, String primeiraSkill, String segundaSkill,
                       String terceiraSkill, String quartaSkill, String ultimateSkill){
        this.numeroDeRegistro = numeroDeRegistro;
        this.primeiraSkill = primeiraSkill;
        this.segundaSkill = segundaSkill;
        this.terceiraSkill = terceiraSkill;
        this.quartaSkill = quartaSkill;
        this.ultimateSkill = ultimateSkill;
    }

}
