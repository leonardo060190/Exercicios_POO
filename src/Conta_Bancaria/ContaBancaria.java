package Conta_Bancaria;

import Pessoa.Pessoa;

public class ContaBancaria {

    private int numero;
    Pessoa titular;

   private double saldo = 0;

//    public ContaBancaria(double saldo) {
//        this.saldo = saldo;
//
//    }

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

    @Override
    public String toString() {
        return
                "titular=" + titular +
                ", saldo=" + saldo;
    }
}
