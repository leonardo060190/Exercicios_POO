package Estudante_media_nota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o nome do estudante: ");
        String nome = leia.next();

        System.out.println("Digite a primeira nota: ");
        double nota1 = leia.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leia.nextDouble();

        Estudante estudante = new Estudante(nome,nota1, nota2);

        estudante.calcularMedia();
        estudante.aprovado();

    }
}
