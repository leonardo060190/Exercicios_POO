package Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a marca: ");
        String marca = leia.next();

        System.out.println("Digite o modelo: ");
        String modelo = leia.next();

        System.out.println("Digite o ano: ");
        int ano = leia.nextInt();

        carro.exibirInformacoesCarro(marca,modelo,ano);


    }
}
