import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
