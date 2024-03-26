package Circulo;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void areaCirculo(){
        double result = Math.PI*Math.pow(raio, 2);
        System.out.println("A área do circulo: "+result);

    }


    public void perimetroCirculo(){
        double result = 2 * Math.PI * raio;
        System.out.println("O perimetro do circulo: "+result);

    }

}
