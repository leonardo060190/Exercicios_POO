package Estudante_media_nota;

public class Estudante {

    private  String nome;

    private double nota1;

    private double nota2;
    double result;

    public Estudante(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void calcularMedia(){
        result = (nota1 + nota2)/2;
        System.out.println("A média é: "+result);
    }

    public void aprovado(){
        if (result >= 7){
            System.out.println("O estudante '" +nome+ "' está aprovado");
        }else {
            System.out.println("O estudante '" +nome+ "' está reprovado");
        }
    }


}
