import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        // Inicializa os dados do cliente
        String nomeCliente = "João Silva";
        String tipoConta = "Corrente"; // ou "Poupança"
        double saldo = 1000.0;

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // Loop para apresentar o menu de opções até que o usuário escolha sair
        while (opcao != 4) {
            System.out.println("\nBem-vindo, " + nomeCliente);
            System.out.println("Tipo de conta: " + tipoConta);
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor (depósito)");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();