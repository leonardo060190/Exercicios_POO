package Relogio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Relogio relogio = new Relogio();

        System.out.println("Digite a hora: ");
        relogio.hora = leia.nextInt();
        System.out.println("Digite a minuto: ");
        relogio.minuto = leia.nextInt();
        System.out.println("Digite a segundo: ");
        relogio.segundo = leia.nextInt();


        relogio.adicionarHora();
        relogio.adicionarMinuto();
        relogio.adicionarSegundo();


        relogio.exibirHorario();

    }
}
