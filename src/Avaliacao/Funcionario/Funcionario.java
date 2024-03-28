package Avaliacao.Funcionario;

public class Funcionario {

    String nome;
    String departamento;
    Double salario;



    public void aumentarSalario(double porcentagem){
        double valorDoAumento = (porcentagem / 100)*salario;
        double valorComAumento = salario + valorDoAumento;
        System.out.println("O novo salario é: R$ "+valorComAumento);


    }

}
