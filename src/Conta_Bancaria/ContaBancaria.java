package Conta_Bancaria;

public class ContaBancaria {

    String titular;

    double saldo;


    public void depositar(double valor, String titular){
        this.saldo = this.saldo + valor;
        System.out.println("Titular: " + titular);
        System.out.println("Depositar: " + valor);
        System.out.println("Novo Saldo: " + this.saldo);

    }

    public void sacar(double valor, String titular){
        if(saldo >= valor){

            this.saldo = this.saldo - valor;

            System.out.println("Titular: " + titular);
            System.out.println("Sacado: " + valor);
            System.out.println("Novo Saldo: " + this.saldo);
        }else {
            System.out.println("Valor insuficiente");
        }

    }
}
