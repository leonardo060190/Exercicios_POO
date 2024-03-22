package Temperatura;

public class Temperatura {

    double celsius;

    double fahrenheit;

    public void celsiusParaFahrenheit(double celsius){
        double result1 = (celsius * 9/5) + 32;
        System.out.println("A temperatura " + celsius + " em celsius equivale a " + result1 + " em fahrenheit");

    }

    public void fahrenheitParaCelsius(double fahrenheit){
        double result2 = (fahrenheit - 32) *5/9;
        System.out.println("A temperatura " + fahrenheit + " em fahrenheit equivale a " + result2 + " em celsius");
    }



}
