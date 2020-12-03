package br.com.guilda;

public class Assassino extends Aventureiro implements ItemInterface  {

    private String tipoDeDano;
    private int dano;
    private int armadura;
    private int resistenciaMagica;
    private int danoLetal;


    public Assassino(String nome, String genero, int idade, double altura,
                     int numeroDeRegistro, String primeiraSkill, String segundaSkill,
                     String terceiraSkill, String quartaSkill, String ultimateSkill,
                     String tipoDeDano, int dano, int armadura, int resistenciaMagica, int danoLetal){

        super(nome, genero, idade, altura,
                numeroDeRegistro, primeiraSkill, segundaSkill,
                terceiraSkill, quartaSkill, ultimateSkill);

        this.tipoDeDano = tipoDeDano;
        this.dano = dano;
        this.armadura = armadura;
        this.resistenciaMagica = resistenciaMagica;
        this.danoLetal = danoLetal;

    }
    @Override
    public void usarItem(ItemClasse Item) {
        this.dano = this.dano + Item.getAtributo();
    }

    public String toString() {
        return "é um assasino " + this.getNome();
    }

}
