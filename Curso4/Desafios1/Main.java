public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        Calculadora dobro = new Calculadora();

        dobro.numero = 5;

        dobro.dobra();
    }
}