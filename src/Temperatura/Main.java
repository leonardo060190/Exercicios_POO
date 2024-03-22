package Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Temperatura temperatura = new Temperatura();

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe a temperatura em celsius: ");
        double celsius = leia.nextDouble();

        temperatura.celsiusParaFahrenheit(celsius);

        System.out.println("Informe a temperatura em fahrenheit: ");
        double fahrenheit = leia.nextDouble();

        temperatura.fahrenheitParaCelsius(fahrenheit);

    }
}
