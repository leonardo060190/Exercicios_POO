package Conta_Bancaria;

import Pessoa.Pessoa;

public class ContaBancaria {

    private int numero;
    private Pessoa titular;

   private double saldo = 0;

    public ContaBancaria(int numero, Pessoa titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Depositar: " + valor);
        System.out.println("Novo Saldo: " + this.saldo);

    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    @Override
    public String toString() {
        return
                "Conta: " + numero +
                ",titular: " + titular.getNome() +
                ", saldo: R$ " + saldo;
    }
}
