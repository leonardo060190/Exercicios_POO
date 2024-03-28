package Avaliacao.Animail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Animal animal = new Animal();

        System.out.println("Digite o nome: ");
        animal.nome = leia.next();

        System.out.println("Digite a especie: ");
        animal.tipo = leia.next();

        System.out.println("Informe a idade: ");
        animal.idade = leia.nextInt();

        System.out.println("Informe o som característico: ");
        String som = leia.next();
        animal.emitirSom(som);

    }
}
