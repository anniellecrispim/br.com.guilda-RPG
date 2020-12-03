package br.com.guilda;

public class Mago extends Aventureiro implements ItemInterface  {

    private String tipoDeDano;
    private int dano;
    private int armadura;
    private int resistenciaMagica;
    private int curar;

    public Mago(String nome, String genero, int idade, double altura,
                int numeroDeRegistro, String primeiraSkill, String segundaSkill,
                String terceiraSkill, String quartaSkill, String ultimateSkill,
                String tipoDeDano, int dano, int armadura, int resistenciaMagica, int curar){

        super(nome, genero, idade, altura,
                numeroDeRegistro, primeiraSkill, segundaSkill,
                terceiraSkill, quartaSkill, ultimateSkill);

        this.tipoDeDano = tipoDeDano;
        this.dano = dano;
        this.armadura = armadura;
        this.resistenciaMagica = resistenciaMagica;
        this.curar = curar;

    }
    @Override
    public void usarItem(ItemClasse Item) {
        this.curar = this.curar + Item.getAtributo();
    }

    public String toString() {
        return "é um mago " + this.getNome();
    }

}
