package Veiculo;

public class Bicicleta implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Bicicleta acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freando...");
    }
}
