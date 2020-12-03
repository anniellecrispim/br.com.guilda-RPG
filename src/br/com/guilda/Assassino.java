package br.com.guilda;

public class Assassino extends Aventureiro  {

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
        this.setArmadura(armadura);
        this.resistenciaMagica = resistenciaMagica;
        this.danoLetal = danoLetal;

    }
    @Override
    public void usarItem(ItemClasse Item) {
        this.dano = this.dano + Item.getAtributo();
    }
    public String getTipoDeDano() {
        return tipoDeDano;
    }

    public void setTipoDeDano(String tipoDeDano) {
        this.tipoDeDano = tipoDeDano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getResistenciaMagica() {
        return resistenciaMagica;
    }

    public void setResistenciaMagica(int resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }

    public int getdanoLetal() {
        return danoLetal;
    }

    public void setdanoLetal(int danoLetal) {
        this.danoLetal = danoLetal;
    }

    public String toString() {
        return "Este aventureiro é o Grande Assassino: " + this.getNome() + " do rank " + this.getRank();
    }
    public int getArmadura() {
        return armadura;
    }
    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }


}
