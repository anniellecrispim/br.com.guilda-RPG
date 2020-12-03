package br.com.guilda;

public class Pessoa {
    private String nome;
    private String genero;
    private int idade;
    private double altura;

    public Pessoa(String nome, String genero, int idade, double altura){
        this.setNome(nome);
        this.setGenero(genero);
        this.setIdade(idade);
        this.setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
