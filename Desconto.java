import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorOriginal = scanner.nextDouble();
        System.out.print("Digite a porcentagem de desconto: ");
        double desconto = scanner.nextDouble();

        double valorComDesconto = valorOriginal - (valorOriginal * (desconto / 100));
        System.out.println("Valor com desconto: R$ " + valorComDesconto);
        scanner.close();
    }
}
