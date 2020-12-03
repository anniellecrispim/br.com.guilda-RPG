package br.com.guilda;

public class Mago extends Aventureiro{

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

        this.setTipoDeDano(tipoDeDano);
        this.setDano(dano);
        this.setArmadura(armadura);
        this.setResistenciaMagica(resistenciaMagica);
        this.curar = curar;

    }
    @Override
    public void usarItem(ItemClasse Item) {
        this.curar = this.curar + Item.getAtributo();
    }

    public String toString() {
        return "Este aventureiro é o Grande Mago: " + this.getNome() + " do rank " + this.getRank();
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
    public int getArmadura() {
        return armadura;
    }
    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    public int getResistenciaMagica() {
        return resistenciaMagica;
    }
    public void setResistenciaMagica(int resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }
    public int getcurar() {
        return curar;
    }

    public void setcurar(int curar) {
        this.curar = curar;
    }

}
