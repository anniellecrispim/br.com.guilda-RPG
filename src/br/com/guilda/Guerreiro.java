package br.com.guilda;

public class Guerreiro extends Aventureiro implements ItemInterface {

    private String tipoDeDano;
    private int dano;
    private int armadura;
    private int resistenciaMagica;
    private int passivaDefesa;


    public Guerreiro(String nome, String genero, int idade, double altura,
                     int numeroDeRegistro, String primeiraSkill, String segundaSkill,
                     String terceiraSkill, String quartaSkill, String ultimateSkill,
                     String tipoDeDano, int dano, int armadura, int resistenciaMagica, int passivaDefesa){

        super(nome, genero, idade, altura,
                numeroDeRegistro, primeiraSkill, segundaSkill,
                terceiraSkill, quartaSkill, ultimateSkill);

        this.setTipoDeDano(tipoDeDano);
        this.setDano(dano);
        this.armadura = armadura;
        this.setResistenciaMagica(resistenciaMagica);
        this.setPassivaDefesa(passivaDefesa);

    }

    @Override
    public void usarItem(ItemClasse Item) {
        this.armadura = this.armadura + Item.getAtributo();
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

    public int getPassivaDefesa() {
        return passivaDefesa;
    }

    public void setPassivaDefesa(int passivaDefesa) {
        this.passivaDefesa = passivaDefesa;
    }

    public String toString() {
        return "é um guerreiro " + this.getNome();
    }

}