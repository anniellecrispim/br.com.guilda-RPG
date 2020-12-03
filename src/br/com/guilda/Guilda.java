package br.com.guilda;

import java.util.ArrayList;

public class Guilda {

    private String nome;
    private ArrayList <Missao> missao = new ArrayList<>();
    private ArrayList <Aventureiro> aventureiros = new ArrayList<Aventureiro>();
    private ArrayList <ItemClasse> itens = new ArrayList<>();


    public Guilda(String nome) {
        this.nome = nome;
    }

    public Aventureiro registrarAssasino(String nome, String genero, int idade, double altura,
                                         int numeroDeRegistro, String primeiraSkill, String segundaSkill,
                                         String terceiraSkill, String quartaSkill, String ultimateSkill,
                                         String tipoDeDano, int dano, int armadura, int resistenciaMagica, int danoLetal) {

        Aventureiro listaAssasino = new Assassino(nome, genero, idade, altura, numeroDeRegistro,
                primeiraSkill, segundaSkill, terceiraSkill, quartaSkill, ultimateSkill,
                tipoDeDano, dano, armadura, resistenciaMagica, danoLetal);

        return listaAssasino;
    }

    public void cadastraAssassino(String nome, String genero, int idade, double altura,
                                  int numeroDeRegistro, String primeiraSkill, String segundaSkill,
                                  String terceiraSkill, String quartaSkill, String ultimateSkill,
                                  String tipoDeDano, int dano, int armadura, int resistenciaMagica, int danoLetal){

        Aventureiro listaAssasino = new Assassino(nome, genero, idade, altura, numeroDeRegistro,
                primeiraSkill, segundaSkill, terceiraSkill, quartaSkill, ultimateSkill,
                tipoDeDano, dano, armadura, resistenciaMagica, danoLetal);
        this.aventureiros.add(listaAssasino);
    }
    public void cadastraMago(String nome, String genero, int idade, double altura,
                             int numeroDeRegistro, String primeiraSkill, String segundaSkill,
                             String terceiraSkill, String quartaSkill, String ultimateSkill,
                             String tipoDeDano, int dano, int armadura, int resistenciaMagica, int curar){

        Aventureiro listaMago = new Mago(nome, genero, idade, altura, numeroDeRegistro,
                primeiraSkill, segundaSkill, terceiraSkill, quartaSkill, ultimateSkill,
                tipoDeDano, dano, armadura, resistenciaMagica, curar);
        this.aventureiros.add(listaMago);
    }

    public void cadastraGuerreiro(String nome, String genero, int idade, double altura,
                                  int numeroDeRegistro, String primeiraSkill, String segundaSkill,
                                  String terceiraSkill, String quartaSkill, String ultimateSkill,
                                  String tipoDeDano, int dano, int armadura, int resistenciaMagica, int passivaDefesa){

        Aventureiro listaGuerreiro = new Guerreiro(nome, genero, idade, altura, numeroDeRegistro,
                primeiraSkill, segundaSkill, terceiraSkill, quartaSkill, ultimateSkill,
                tipoDeDano, dano, armadura, resistenciaMagica, passivaDefesa);
        this.aventureiros.add(listaGuerreiro);
    }
    public void cadastraMissao(String tituloDaMissao,int dificuldade, int idItem, int numeroMissao) {

        //Inicializar Itens com A, verificar se itens existe e retorna
        ItemClasse itemA = null;
        for(ItemClasse item : itens ) {
            if(item.getNumeroDoItem() == idItem) {
                itemA = item;
            }
            else {
                System.out.println("Recompensa não cadastrada");
            }
        }
        //Se Item for null, não irá rodar
        if (itemA !=  null) {
            Missao quadroDeMissoes = new Missao(tituloDaMissao,dificuldade, itemA, numeroMissao);
            this.missao.add(quadroDeMissoes);
        }
    }



    public void deletaMissao(int numeroMissao) {
        Missao missaoA = null;
        for (Missao missoes : missao) {
            if(missoes.getNumeroMissao() == numeroMissao) {
                missaoA = missoes;
            }
        }
        this.missao.remove(missaoA);
    }
    public Missao buscarMissao(int numeroMissao) {
        for (Missao missoes : missao) {
            if(missoes.getNumeroMissao() == numeroMissao) {
                return missoes;
            }
        }
        return null;
    }

    public void alterarDificuldadeMissao(int numeroMissao, int dificuldade) {
        Missao alteraMissao = buscarMissao(numeroMissao);
        alteraMissao.setDificuldade(dificuldade);
    }

    public Aventureiro buscarAventureiro(int numeroDeRegistro) {
        for(Aventureiro aventureiros : aventureiros) {
            if(aventureiros.getNumeroDeRegistro() == numeroDeRegistro) {
                return aventureiros;
            }
        }
        return null;
    }

    public void alterarRank(int numeroDeRegistro, int rank) {
        Aventureiro alteraRankAventureiro = buscarAventureiro(numeroDeRegistro);
        alteraRankAventureiro.setRank(rank);
    }

    public void cadastraItem(String atributoNome, int atributo, int numeroDoItem) {
        ItemClasse cadastraitens = new ItemClasse(atributoNome, atributo, numeroDoItem);
        this.itens.add(cadastraitens);
    }

    public ItemClasse buscarItem(int numeroDoItem) {
        for(ItemClasse item : itens ) {
            if(item.getNumeroDoItem() == numeroDoItem) {
                return item;
            }
        }
        return null;
    }
    public void removerItem(int numeroDoItem) {
        ItemClasse itemA = null;
        for (ItemClasse item : itens) {
            if(item.getNumeroDoItem() == numeroDoItem) {
                itemA = item;
            }
        }
        this.itens.remove(itemA);
    }

    public void printAventureiro() {
        for(Aventureiro aventureiros : aventureiros) {
            System.out.println(aventureiros);
        }

    }

    public ArrayList <Aventureiro> getAventureiros() {
        return aventureiros;
    }

    public ArrayList <Missao> getMissao() {
        return missao;
    }


}
