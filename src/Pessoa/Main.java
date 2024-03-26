package Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leia.next();
        System.out.println("Informe sua idade: ");
        int idade = leia.nextInt();
        System.out.println("Informe seu cpf");
        String cpf = leia.next();

        Pessoa pessoa = new Pessoa(nome, idade, cpf);

        pessoa.exibirSaudacao();

        System.out.println(pessoa);

    }
}
