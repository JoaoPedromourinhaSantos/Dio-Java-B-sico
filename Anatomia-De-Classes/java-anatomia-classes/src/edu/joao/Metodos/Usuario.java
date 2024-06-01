package edu.joao.Metodos;

public class Usuario {
    public static void main(String[] args) {

    SmartTv smartTv = new SmartTv();
    
    System.out.println("Está ligada ? " +smartTv.ligada);
    System.out.println("canal: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Está ligada agora? " + smartTv.ligada);
    
       // smartTv.desligar();
        //System.out.println("Está ligada agora? " + smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " +smartTv.canal);


   smartTv.aumentarVolume();
   smartTv.diminuirVolume();
   // smartTv.diminuirVolume();

    System.out.println("Está ligada ? " +smartTv.ligada);
    System.out.println("Canal atual: " +smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    }
}
