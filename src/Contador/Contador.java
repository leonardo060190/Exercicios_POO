package Contador;

public class Contador {
    int valor;

    public void incrementar(){
        valor ++; //valor = valor + 1;
    }

    public void decrementar(){
        valor --;
    }

    public void exibirValor(){
        System.out.println("O valor Atual é: " + valor);
    }
}
