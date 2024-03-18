public class Pessoa {
    //Atributos int double
    String nome;
    String sobrenome;
    int idade;
    //Métodos que são as funções
    public void correr(){
        System.out.println("Está correndo!");
    }
    //pessoa1.exibirDetalhes();
    public void exibirDetalhes(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Sobrenome:"+this.sobrenome);
        System.out.println("Idade:"+this.idade);

    }

}