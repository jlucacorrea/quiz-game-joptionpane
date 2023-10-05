import java.util.ArrayList;

public class game {
    public static void main(String[] args) {
        perguntas pergunta = new perguntas();

        while (pergunta.index < 4) { // Continue enquanto houver perguntas
            switch (pergunta.index) {
                case 0:
                    pergunta.pergunta1();
                    break;
                case 1:
                    pergunta.pergunta2();
                    break;
                case 2:
                    pergunta.pergunta3();
                    break;
                case 3:
                    pergunta.pergunta4();
                    break;
            }
        }

    }
}
