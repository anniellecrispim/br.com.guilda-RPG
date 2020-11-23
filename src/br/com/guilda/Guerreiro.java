package br.com.guilda;

public class Guerreiro extends Aventureiro {

    private String tipoDeDano;
    private int dano;
    private int armadura;
    private int resistenciaMagica;
    private int passivaDefesa;

    public Guerreiro(String nome, String genero, int idade, double altura,
                     String numeroDeRegistro, String primeiraSkill, String segundaSkill,
                     String terceiraSkill, String quartaSkill, String ultimateSkill,
                     String tipoDeDano, int dano, int armadura, int resistenciaMagica, int passivaDefesa){

        super(nome, genero, idade, altura,
                numeroDeRegistro, primeiraSkill, segundaSkill,
                terceiraSkill, quartaSkill, ultimateSkill);

        this.tipoDeDano = tipoDeDano;
        this.dano = dano;
        this.armadura = armadura;
        this.resistenciaMagica = resistenciaMagica;
        this.passivaDefesa = passivaDefesa;
    }

}


