package Conta_Bancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String titular = leia.next();

        System.out.println("Digite o valor: ");
        double valor = leia.nextDouble();

        contaBancaria.depositar(valor, titular);

        System.out.println("Digite o nome do titular para saque: ");
        String titularSaque = leia.next();

        System.out.println("Digite o valor: ");
        double valorSaque = leia.nextDouble();
        contaBancaria.sacar(valorSaque,titularSaque);


    }
}
