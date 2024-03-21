package Produto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto();

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = leia.next();

        System.out.println("Digite o valor: ");
        double valor = leia.nextDouble();

        System.out.println("Digite a quantidade: ");
        double quatidade = leia.nextDouble();

        produto.valorTotal(nome,valor,quatidade);

    }
}
