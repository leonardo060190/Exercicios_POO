package Avaliacao.Contador;

import java.util.Scanner;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Contador contador = new Contador();

        System.out.println("Informe um valor para o contador: ");
        contador.valor = leia.nextInt();

        contador.incrementar();
        contador.exibirValor();
        contador.decrementar();
        contador.exibirValor();


    }
}
