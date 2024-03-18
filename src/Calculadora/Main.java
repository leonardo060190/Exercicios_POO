package Calculadora;

public class Main {
    public static void main(String[] args) {
        //Criando o objeto calculadora
        Calculadora calculadora = new Calculadora();

        double resultadoSoma = 0;
        resultadoSoma = calculadora.somar(5,10);
        System.out.println("A soma é: " + resultadoSoma);


        double resultadoSubtrair = 0;
        resultadoSubtrair = calculadora.subtrair(5,10);
        System.out.println("A Subtração é: " + resultadoSubtrair);

        double resultadoMultiplicar = 0;
        resultadoMultiplicar = calculadora.multiplicar(5,10);
        System.out.println("A Subtração é: " + resultadoMultiplicar);

//        double resultadoDividir = 0;
//        resultadoDividir = calculadora.dividir(5,10);
//        System.out.println("A Subtração é: " + resultadoDividir);
}


}
