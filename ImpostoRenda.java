import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        double imposto;
        if (salario <= 1903.98) {
            imposto = 0;
        } else if (salario <= 2826.65) {
            imposto = salario * 0.075;
        } else if (salario <= 3751.05) {
            imposto = salario * 0.15;
        } else if (salario <= 4664.68) {
            imposto = salario * 0.225;
        } else {
            imposto = salario * 0.275;
        }

        System.out.println("Imposto de Renda devido: R$ " + imposto);
        scanner.close();
    }
}
