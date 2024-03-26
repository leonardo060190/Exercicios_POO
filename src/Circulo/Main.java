package Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double raio = leia.nextDouble();

        Circulo circulo = new Circulo(raio);

       circulo.areaCirculo();
       circulo.perimetroCirculo();


    }
}
