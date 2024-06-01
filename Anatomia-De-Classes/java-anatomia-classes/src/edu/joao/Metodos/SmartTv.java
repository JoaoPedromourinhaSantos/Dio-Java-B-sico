package edu.joao.Metodos;

public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 0;

   public void ligar(){
    ligada = true;
   }

   public void desligar (){
    ligada = false;
   }

  
   public void aumentarVolume (){
    volume++;
    System.out.println("Volume aumentado para: " + volume);
   }

   public void diminuirVolume(){
    volume--;
    System.out.println("Volume diminuido para: " + volume);
   }

   public void aumentarCanal(){
    canal++;
    System.out.println("Passou de canal! canal atual: " + canal);
   }

   public void diminuirCanal(){
    canal--;
    System.out.println("Voltou um canal: canal atual " + canal);
   }

   public void mudarCanal (int novoCanal){
    canal = novoCanal;

   }
}
