public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        Calculadora dobro = new Calculadora();

        dobro.numero = 5;

        dobro.dobra();

        Musica musica = new Musica();
        musica.titulo = "Imagine";
        musica.artista = "John Lennon";
        musica.anoDeLancamento = 1971;
        musica.numAvaliacoes = 0;
    }
}