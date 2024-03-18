package Batalha;

public class Main {

    public static void main(String[] args){
        Heroi heroi1 = new Heroi();
        Heroi heroi2 = new Heroi();
        heroi1.nome = "thor";
        heroi1.forca = 50;
        heroi1.nome = "Hulk";
        heroi1.forca = 40;
        heroi1.atacar(heroi2);
        heroi2.atacar(heroi1);

    }
}
