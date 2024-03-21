package Produto;

public class Produto {

    String nome;

    double preco;

    double quantidade;

    public void valorTotal(String nome, double preco, double quantidade){

        double vt = preco * quantidade;

        System.out.println("Valor total: "+nome+" "+vt);
    }

}
