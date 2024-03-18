package Batalha;

public class Heroi {
    String nome;
    int vida = 100;
    int forca;
    public void atacar(Heroi alvo){
        alvo.vida = alvo.vida - this.forca;
        System.out.println("A vida agora é:"+alvo.vida);
    }
}
