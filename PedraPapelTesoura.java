import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Escolha: 0 - Pedra, 1 - Papel, 2 - Tesoura");
        int jogador = scanner.nextInt();
        int computador = rand.nextInt(3);

        String[] opcoes = { "Pedra", "Papel", "Tesoura" };
        System.out.println("Você escolheu: " + opcoes[jogador]);
        System.out.println("Computador escolheu: " + opcoes[computador]);

        if (jogador == computador) {
            System.out.println("Empate!");
        } else if ((jogador == 0 && computador == 2) ||
                (jogador == 1 && computador == 0) ||
                (jogador == 2 && computador == 1)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Computador venceu!");
        }
        scanner.close();
    }
}
