package Testando;

import javax.swing.JOptionPane;
import br.com.guilda.*;

public class TestandoGuerreiroMissao {

    public static void main(String[] args) {
        //Classe var = new Construtor( n atributos)

		/*String nome, String genero, int idade, double altura,
		String numeroDeRegistro, String primeiraSkill, String segundaSkill,
        String terceiraSkill, String quartaSkill, String ultimateSkill,
		String tipoDeDano, int dano, int armadura, int resistenciaMagica, int passivaDefesa
		*/

        Guerreiro guerreiro = new Guerreiro("Arthur", "masculino", 24, 1.80,
                "1", "", "", "", "", "",
                "físico", 20, 50, 10, 5);

        Item recompensa1 = new Item();
        //String tituloDaMissao,int dificuldade, Item recompensa
        Missao missao1 = new Missao("Teste", 1, recompensa1);
        System.out.println(missao1.getStatus());
        System.out.println(guerreiro.iniciarMissao(missao1));
        System.out.println(missao1.getStatus());
        for (int i = 0; i <= 1; ++i) {
            System.out.println("Selecione sua skill\n"
                    + "1. Habilidade 1\n"
                    + "2. Habilidade 2\n"
                    + "3. Habilidade 3\n"
                    + "4. Super habilidade");
            int entradaSkill = Integer.parseInt(JOptionPane.showInputDialog(""));
            if (entradaSkill == 1 || entradaSkill == 3) {
                missao1.falharMissao();
                System.out.println("U DIED");
                break;
            } else if (entradaSkill == 4) {
                missao1.concluirMissao();
                System.out.println("Boss a defetede\n"
                        + "Você ganhou como recompensa um item");
                break;
            } else if (i == 1) {
                missao1.falharMissao();
                System.out.println("U DIED");
                break;
            }
        }
        System.out.println(missao1.getStatus());
    }
}