import desafio2.modelos.Livro;
import desafio2.modelos.idadePessoa;
import desafio2.modelos.ContaBancaria;
import desafio2.modelos.Aluno;
import desafio2.modelos.Livro;

public class MainDesafios2 {
    public static void main(String[] args) {
        idadePessoa pessoa1 = new idadePessoa();
        pessoa1.setNome("Pablo");
        pessoa1.setIdade(20);

        pessoa1.verificarIdade();
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedrinho");
        aluno1.setNotas(10, 20);


        System.out.println("A média das notas de " + aluno1.getNome() + " é: " + aluno1.calcularMedia());

        Livro livreto = new Livro();

        livreto.setAutor("Julian");
        livreto.setTitulo("Hora da estrela");

        livreto.exibirDetalhes();

    }
}
