public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Avaliação atual: " + avaliacao);
    }
    void avalia(double novaAvaliacao) {

        avaliacao = (avaliacao * numAvaliacoes + novaAvaliacao) / (numAvaliacoes + 1);
        numAvaliacoes++;
        System.out.println("Nova avaliação adicionada. Avaliação média atual: " + avaliacao);
    }
}


