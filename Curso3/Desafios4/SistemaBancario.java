import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        String nomeCliente = "João Silva";
        String tipoConta = "Corrente";
        double saldo = 1000.0;

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

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

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nSaldo disponível: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("\nDigite o valor que deseja depositar: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + saldo);
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o valor que deseja transferir: R$ ");
                    double valorTransferencia = scanner.nextDouble();
                    if (valorTransferencia > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else if (valorTransferencia <= 0) {
                        System.out.println("Valor inválido.");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("Transferência realizada com sucesso! Novo saldo: R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("\nObrigado por usar o sistema!");
                    break;
            }
        }

        scanner.close();
    }
}
