package br.com.guilda;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String nome;
        String genero;
        int idade;
        double altura;
        int numeroDeRegistro;
        String primeiraSkill;
        String segundaSkill;
        String terceiraSkill;
        String quartaSkill;
        String ultimateSkill;
        String tipoDeDano;
        int dano;
        int armadura;
        int resistenciaMagica;
        int PassivaDefesa;
        int danoLetal;
        int curar;
        int IdAventureiro;
        String tituloDaMissao;
        int numeroMissao;
        int idItem;
        int dificuldade;
        String nomeDoItem;
        int atributo;
        int numeroDoItem;

        boolean Start = true;

        Guilda newguilda = new Guilda("");
        //Casos para Testes
        newguilda.cadastraAssassino("Annielle", "n", 20, 1.6, 11, "", "", "", "", "", "físico", 40, 30, 20, 10);
        newguilda.cadastraGuerreiro("Marco", "m", 19, 1.7, 22, "", "", "", "", "", "Esmagador", 20, 40, 30, 10);
        newguilda.cadastraMago("Jean", "m", 20, 1.6, 33, "", "", "", "", "", "Magico", 40, 20, 30, 10);
        newguilda.cadastraItem("Adaga enferrujada", 10, 1);
        newguilda.cadastraMissao("Goblins atacaram a vila!!!", 1, 1, 1);
        newguilda.cadastraMissao("Zombies atacando!!!", 1, 1, 2);

        while (Start == true) {
            int selecao = Integer.parseInt(JOptionPane.showInputDialog("1. Registro de Aventureiros \n"
                    + "2. Quadro de Missões \n" + "3. Armazem da Guilda \n" + "4. Sair"));
            if (selecao == 1) {
                int registroAventureiros = Integer.parseInt(JOptionPane.showInputDialog(
                        "1. Cadastrar Aventureiros \n" + "2. Buscar Aventureiros \n" + "3. Alterar Rank"));
                if (registroAventureiros == 1) {
                    int selecaoClasse = Integer.parseInt(JOptionPane.showInputDialog(
                            "Qual a classe do aventureiro ? \n" + "1. Assassino \n" + "2. Guerreiro \n" + "3. Mago"));

                    if (selecaoClasse == 1) {
                        nome = JOptionPane.showInputDialog("Qual o nome do aventureiro?: ");
                        genero = JOptionPane.showInputDialog("Qual o genero do aventureiro?: ");
                        idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos ele tem?: "));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura dele?: "));
                        numeroDeRegistro = Integer
                                .parseInt(JOptionPane.showInputDialog("Qual o numero de registro dele ? "));
                        primeiraSkill = JOptionPane.showInputDialog("Qual a primeira skill? ");
                        segundaSkill = JOptionPane.showInputDialog("Qual a segunda skill? ");
                        terceiraSkill = JOptionPane.showInputDialog("Qual a terceira skill? ");
                        quartaSkill = JOptionPane.showInputDialog("Qual a quarta skill? ");
                        ultimateSkill = JOptionPane.showInputDialog("Qual a skill ultimate? ");
                        tipoDeDano = JOptionPane.showInputDialog("Que tipo de dano ele causa? ");
                        dano = Integer.parseInt(JOptionPane.showInputDialog("Quanto de dano ele causa? "));
                        armadura = Integer.parseInt(JOptionPane.showInputDialog("Quanto de armadura ele tem ? "));
                        resistenciaMagica = Integer
                                .parseInt(JOptionPane.showInputDialog("Quanta resistencia magica ele possui? "));
                        danoLetal = Integer
                                .parseInt(JOptionPane.showInputDialog("Quanto de dano letal extra ele causa?: "));

                        newguilda.cadastraAssassino(nome, genero, idade, altura, numeroDeRegistro, primeiraSkill,
                                segundaSkill, terceiraSkill, quartaSkill, ultimateSkill, tipoDeDano, dano, armadura,
                                resistenciaMagica, danoLetal);
                    } else if (selecaoClasse == 2) {

                        nome = JOptionPane.showInputDialog("Qual o nome do aventureiro?: ");
                        genero = JOptionPane.showInputDialog("Qual o genero do aventureiro?: ");
                        idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos ele tem?: "));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura dele?: "));
                        numeroDeRegistro = Integer
                                .parseInt(JOptionPane.showInputDialog("Qual o numero de registro dele ? "));
                        primeiraSkill = JOptionPane.showInputDialog("Qual a primeira skill? ");
                        segundaSkill = JOptionPane.showInputDialog("Qual a segunda skill? ");
                        terceiraSkill = JOptionPane.showInputDialog("Qual a terceira skill? ");
                        quartaSkill = JOptionPane.showInputDialog("Qual a quarta skill? ");
                        ultimateSkill = JOptionPane.showInputDialog("Qual a skill ultimate? ");
                        tipoDeDano = JOptionPane.showInputDialog("Que tipo de dano ele causa? ");
                        dano = Integer.parseInt(JOptionPane.showInputDialog("Quanto de dano ele causa? "));
                        armadura = Integer.parseInt(JOptionPane.showInputDialog("Quanto de armadura ele tem ? "));
                        resistenciaMagica = Integer
                                .parseInt(JOptionPane.showInputDialog("Quanta resistencia magica ele possui? "));
                        PassivaDefesa = Integer
                                .parseInt(JOptionPane.showInputDialog("Quanto de armadura extra ele recebe? "));

                        newguilda.cadastraGuerreiro(nome, genero, idade, altura, numeroDeRegistro, primeiraSkill,
                                segundaSkill, terceiraSkill, quartaSkill, ultimateSkill, tipoDeDano, dano, armadura,
                                resistenciaMagica, PassivaDefesa);

                    }

                    else if (selecaoClasse == 3) {
                        nome = JOptionPane.showInputDialog("Qual o nome do aventureiro?: ");
                        genero = JOptionPane.showInputDialog("Qual o genero do aventureiro?: ");
                        idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos ele tem?: "));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura dele?: "));
                        numeroDeRegistro = Integer
                                .parseInt(JOptionPane.showInputDialog("Qual o numero de registro dele ? "));
                        primeiraSkill = JOptionPane.showInputDialog("Qual a primeira skill? ");
                        segundaSkill = JOptionPane.showInputDialog("Qual a segunda skill? ");
                        terceiraSkill = JOptionPane.showInputDialog("Qual a terceiras kill? ");
                        quartaSkill = JOptionPane.showInputDialog("Qual a quarta skill? ");
                        ultimateSkill = JOptionPane.showInputDialog("Qual a skill ultimate? ");
                        tipoDeDano = JOptionPane.showInputDialog("Que tipo de dano ele causa? ");
                        dano = Integer.parseInt(JOptionPane.showInputDialog("Quanto de dano ele causa? "));
                        armadura = Integer.parseInt(JOptionPane.showInputDialog("Quanto de armadura ele tem ? "));
                        resistenciaMagica = Integer
                                .parseInt(JOptionPane.showInputDialog("Quanta resistencia magica ele possui? "));
                        curar = Integer.parseInt(JOptionPane.showInputDialog("Quanto de vida ele cura ? "));

                        newguilda.cadastraGuerreiro(nome, genero, idade, altura, numeroDeRegistro, primeiraSkill,
                                segundaSkill, terceiraSkill, quartaSkill, ultimateSkill, tipoDeDano, dano, armadura,
                                resistenciaMagica, curar);

                    }
                } // registroAventureiros 1
                else if (registroAventureiros == 2) {
                    IdAventureiro = Integer.parseInt(JOptionPane.showInputDialog("Qual o ID do Aventureiro?"));
                    JOptionPane.showMessageDialog(null, "Essa é a ficha do aventureiro que vc procura: "
                            + (newguilda.buscarAventureiro(IdAventureiro)));
                    System.out.println(newguilda.buscarAventureiro(IdAventureiro));
                } // registroAventureiros 2

                else if (registroAventureiros == 3) {
                    IdAventureiro = Integer.parseInt(JOptionPane.showInputDialog("Qual o ID do Aventureiro?"));
                    int NovoRank = Integer.parseInt(JOptionPane.showInputDialog("Qual o novo rank do aventureiro"));
                    newguilda.alterarRank(IdAventureiro, NovoRank);
                    JOptionPane.showMessageDialog(null, "O novo rank do aventureiro é: " + NovoRank);
                    System.out.println(+NovoRank);

                } // registroAventureiros 3

            } // selecao 1
            else if (selecao == 2) {
                int quadroDeMissoes = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar Missão \n"
                        + "2. Buscar Missão \n" + "3. Alterar Dificuldade de Missão \n" + "4. Iniciar uma Missão"));
                if (quadroDeMissoes == 1) {
                    tituloDaMissao = JOptionPane.showInputDialog("Qual o nome da Missão ? ");
                    dificuldade = Integer
                            .parseInt(JOptionPane.showInputDialog("Qual o nivel de dificuldade da missão? "));
                    idItem = Integer.parseInt(JOptionPane.showInputDialog("Qual o id do item ? "));
                    numeroMissao = Integer
                            .parseInt(JOptionPane.showInputDialog("Qual o numero de registro da missão? "));
                    newguilda.cadastraMissao(tituloDaMissao, dificuldade, idItem, numeroMissao);
                } else if (quadroDeMissoes == 2) {
                    numeroMissao = Integer
                            .parseInt(JOptionPane.showInputDialog("Qual o numero de registro da missão? "));
                    JOptionPane.showMessageDialog(null,
                            "Essa missão está no mural: " + newguilda.buscarMissao(numeroMissao));
                    newguilda.buscarMissao(numeroMissao);
                } else if (quadroDeMissoes == 3) {
                    numeroMissao = Integer
                            .parseInt(JOptionPane.showInputDialog("Qual o numero de registro da missão? "));
                    dificuldade = Integer
                            .parseInt(JOptionPane.showInputDialog("Qual o nivel de dificuldade da missão? "));
                    newguilda.alterarDificuldadeMissao(numeroMissao, dificuldade);
                } else if (quadroDeMissoes == 4) {
                    Missao missao1 = newguilda.buscarMissao(Integer.parseInt(JOptionPane
                            .showInputDialog("Qual missão vamos cumprir hoje?:(numero de registro da missão) ")));
                    Aventureiro aventureiro = newguilda.buscarAventureiro(Integer.parseInt(JOptionPane.showInputDialog(
                            "Qual aventureiro vai iniciar na missão?:(numero de registro do aventureiro) ")));
                    String iniciarMissao = aventureiro.iniciarMissao(missao1);
                    JOptionPane.showMessageDialog(null, iniciarMissao);
                    if (iniciarMissao == "MissÃ£o aceita.") {

                        int usar = Integer.parseInt(
                                JOptionPane.showInputDialog("Voce deseja usar um item? \n" + "1. Sim \n" + "2. Não"));
                        if (usar == 1 && aventureiro.getBolsa().size() >= 1) {
                            ItemClasse item = newguilda.buscarItem(Integer
                                    .parseInt(JOptionPane.showInputDialog("Qual o numero de registro do item? ")));
                            aventureiro.usarItem(item);
                        } else {
                            JOptionPane.showMessageDialog(null, "Sem itens, boa sorte!!!");

                        }

                        for (int i = 0; i <= 1; ++i) {
                            int entradaSkill = Integer.parseInt(JOptionPane.showInputDialog("Selecione sua skill\n"
                                    + "1. Habilidade 1\n" + "2. Habilidade 2\n" + "3. Habilidade 3\n"
                                    + "4. Super habilidade\n" + "5. Fugir como um covarde"));
                            if (entradaSkill == 1 || entradaSkill == 3) {
                                missao1.falharMissao();
                                JOptionPane.showMessageDialog(null, "U DIED");
                                break;
                            } else if (entradaSkill == 4) {
                                missao1.concluirMissao();
                                aventureiro.receberRecompensa(missao1);
                                JOptionPane.showMessageDialog(null,
                                        "Boss a defetede\n" + "Você ganhou como recompensa um item");
                                break;
                            } else if (i == 1) { // morte pelo tempo
                                missao1.falharMissao();
                                JOptionPane.showMessageDialog(null, "U DIED");
                                break;

                            } else if (entradaSkill == 5) {
                                JOptionPane.showMessageDialog(null,
                                        "Fugiu com o rabo entre as pernas, covarde. GIT GUD SCRUB!!!");
                                missao1.falharMissao();
                                break;
                            }
                        }
                    }
                }
            } else if (selecao == 3) {
                int armazemDaGuilda = Integer.parseInt(
                        JOptionPane.showInputDialog("1. Cadastrar Item \n" + "2. Buscar Item \n" + "3. Remover Item"));
                if (armazemDaGuilda == 1) {
                    nomeDoItem = JOptionPane.showInputDialog("Qual o nome do poderoso artefato ? ");
                    atributo = Integer.parseInt(JOptionPane.showInputDialog("Quanto de bonus o item da ? "));
                    numeroDoItem = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de registro do item? "));
                    newguilda.cadastraItem(nomeDoItem, atributo, numeroDoItem);
                } else if (armazemDaGuilda == 2) {
                    numeroDoItem = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de registro do item? "));
                    JOptionPane.showMessageDialog(null,
                            "o item que você busca é: " + newguilda.buscarItem(numeroDoItem));
                } else if (armazemDaGuilda == 3) {
                    numeroDoItem = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de registro do item? "));
                    newguilda.removerItem(numeroDoItem);
                }
            } else if (selecao == 4) {
                Start = false;
            }

        }
        JOptionPane.showMessageDialog(null, "Parabéns, você saiu!!!");
    }
}
