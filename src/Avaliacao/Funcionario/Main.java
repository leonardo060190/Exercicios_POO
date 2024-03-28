package Avaliacao.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionario: ");
        funcionario.nome = leia.next();

        System.out.println("Informe o departamento: ");
        funcionario.departamento = leia.next();

        System.out.println("Digite a salario atual: ");
        funcionario.salario = leia.nextDouble();

        System.out.println("Digite o aumento em porcentagem: ");
        double porcentagem = leia.nextDouble();

        funcionario.aumentarSalario(porcentagem);




    }
}
