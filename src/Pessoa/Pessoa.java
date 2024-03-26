package Pessoa;

public class Pessoa {

    private String nome;

    private int idade;

    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirSaudacao(){
        System.out.println("Olá "+this.nome);
    }

    @Override
    public String toString() {
        return
                "nome: " + nome +
                ", idade: " + idade +
                ", cpf: " + cpf ;
    }

}
