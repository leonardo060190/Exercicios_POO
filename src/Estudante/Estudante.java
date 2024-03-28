package Estudante;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Estudante {
    ArrayList<Double> notas = new ArrayList();
    String nome;

    public void adicionarNota(double nota){
        notas.add(nota);
    }
    public double calculaMedia(){
        int quantidadeNotas = notas.size();
        double media = 0;
        double somaNotas = 0;
        for(int i = 0 ; i < quantidadeNotas; i++ ){
            somaNotas = somaNotas + notas.get(i);
        }
        media = somaNotas/quantidadeNotas;
        return media;
    }
}