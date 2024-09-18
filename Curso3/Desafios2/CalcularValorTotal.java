public class CalcularValorTotal {
    public static void main(String[] args) {
        double precoProduto = 19.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;

        double percentualDesconto = 10; // 10%
        double valorDesconto = (valorTotal * percentualDesconto) / 100;
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("O valor total com desconto é: R$ " + valorFinal);
    }
}
