package Temperatura;

public class Temperatura {

    double celsius;

    public void celsiusParaFahrenheit(double celsius){
        double result1 = (celsius * 9/5) + 32;
        System.out.println("A temperatura " + celsius + " em celsius equivale a " + result1 + " em fahrenheit");

    }



}
