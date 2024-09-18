public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
    void calcularIdade(){
        System.out.println("Seu carro tem " + (ano - 2024) + "anos");
    }
}
