package Conta_Bancaria;

import Pessoa.Pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = leia.nextInt();

        System.out.println("Digite o nome do titular: ");
        String nomeTitular = leia.next();

        Pessoa titular = new Pessoa(nomeTitular,0,"");

        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, titular);

        System.out.println("Digite o valor para depositar: ");
        double valorDeposito = leia.nextDouble();

        // Realizando depósito na conta bancária
        contaBancaria.depositar(valorDeposito);

        System.out.println("Digite o valor para saque: ");
        double valorSaque = leia.nextDouble();

        // Realizando saque na conta bancária
        contaBancaria.sacar(valorSaque);

        // Exibindo informações da conta bancária
        System.out.println(contaBancaria);


    }
}
