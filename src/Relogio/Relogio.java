package Relogio;

public class Relogio {

    int hora;

    int minuto;

    int segundo;

    public void adicionarHora(){
        this.hora ++;
        if (hora == 24){
            hora = 0;
        }
    }

    public void adicionarMinuto(){
        this.minuto ++;
        this.hora += this.minuto / 60;
        this.minuto %= 60;
        this.hora %= 24;
    }

    public void adicionarSegundo(){
        this.segundo ++;
        this.minuto += this.segundo / 60;
        this.segundo %= 60;
        this.hora += this.minuto / 60;
        this.minuto %= 60;
        this.hora %= 24;
    }

    public void exibirHora(){
        System.out.printf("%02d:%02d:%02d\n", this.hora, this.minuto, this.segundo);
    }


}
