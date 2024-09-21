package desafio2.modelos;

public class idadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
          ;
        if (this.idade >= 18) {

            System.out.println("VOcê é maior de idade. Possui: " + this.idade + " Anos");

        } else {
            System.out.println("Menor de idade");
        }
    }
}
