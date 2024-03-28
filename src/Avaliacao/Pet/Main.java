package Avaliacao.Pet;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Pet pet = new Pet();

        System.out.println("Informe a especie: ");
        pet.especie = leia.next();

        System.out.println("Informe o nome: ");
        pet.nome = leia.next();

        System.out.println("Informe a idade: ");
        pet.idade = leia.nextInt();

        System.out.println(pet.toString());



    }
}
