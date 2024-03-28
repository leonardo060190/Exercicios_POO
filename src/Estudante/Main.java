package Estudante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Estudante estudante = new Estudante();
        estudante.nome = "Mario";
        System.out.println("Digite a nota 1:");
        double nota1 = leia.nextDouble();
        estudante.adicionarNota(nota1);
        System.out.println("Digite a nota 2:");
        double nota2 = leia.nextDouble();
        estudante.adicionarNota(nota2);
        double mediaFinal = estudante.calculaMedia();
        System.out.println("O estudante "+estudante.nome);
        System.out.println("tem média:"+mediaFinal);

    }
}