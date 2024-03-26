package Livros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o titulo: ");
        String titulo = leia.next();
        System.out.println("Digite o autor: ");
        String autor = leia.next();
        System.out.println("Digite o ano: ");
        int ano = leia.nextInt();
        System.out.println("Digite o valor: ");
        double preco = leia.nextDouble();
        System.out.println("Informe o valor o desconto em Procentagem: ");
        int porcentagemDesconto = leia.nextInt();
        Livro livro = new Livro(titulo, autor, ano, preco, porcentagemDesconto);

        System.out.println(livro.exibirDetalhes());
        livro.desconto(porcentagemDesconto,preco);
    }
}
