
import javax.swing.*;
import java.util.Scanner;

public class perguntas {

    Scanner leia = new Scanner(System.in);
    public int index = 0;
    // PRIMEIRA PERGUNTA
    public void pergunta1() {
        String opcao = JOptionPane.showInputDialog(null, "Quantos barcos se faz uma canoas?" + "\n1 - TRÊS | 2 - QUATRO | 3 - SETE" );
        int opcaoConvertida = Integer.parseInt(opcao);

        if (opcaoConvertida == 1){
            System.out.println("ACERTOU!");
            index++;
            System.out.println(index);

        } else {
            System.out.println("VOCÊ ERROU A PERGUNTA!");
            System.out.println("FIM DE JOGO.");
        }
    }

    //SEGUNDA PERGUNTA
    public void pergunta2() {
        String opcao = JOptionPane.showInputDialog(null, "Qual é a capital da França?" + "\n1 - Monaco | 2 - Paris | 3 - Chipre " );
        int opcaoConvertida = Integer.parseInt(opcao);

        if (opcaoConvertida == 2){
            System.out.println("ACERTOU!");
            index++;
        } else {
            System.out.println("VOCÊ ERROU A PERGUNTA!");
            System.out.println("FIM DE JOGO.");
        }
    }

    //TERCEIRA PERGUNTA
    public void pergunta3() {
        String opcao = JOptionPane.showInputDialog(null, "Quem escreveu Romeu e Julieta?" + "\n1 - William Shakespeare | 2 - Charles Darwin | 3 - Guilherme Guimaraes " );
        int opcaoConvertida = Integer.parseInt(opcao);

        if (opcaoConvertida == 1){
            System.out.println("ACERTOU!");
            index++;
        } else {
            System.out.println("VOCÊ ERROU A PERGUNTA!");
            System.out.println("FIM DE JOGO.");
        }
    }

    //QUARTA PERGUNTA
    public void pergunta4() {
        String opcao = JOptionPane.showInputDialog(null, "Qual é a fórmula química da água?" + "\n11 - H3H2 | 2 - H3D0 | 3 - H20 " );
        int opcaoConvertida = Integer.parseInt(opcao);

        if (opcaoConvertida == 3){
            System.out.println("ACERTOU!");
            index++;
        } else {
            System.out.println("VOCÊ ERROU A PERGUNTA!");
            System.out.println("FIM DE JOGO.");
        }
    }
}
