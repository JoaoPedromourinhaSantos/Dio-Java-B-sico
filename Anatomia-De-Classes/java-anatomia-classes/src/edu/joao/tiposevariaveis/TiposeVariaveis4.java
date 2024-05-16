package edu.joao.tiposevariaveis;

public class TiposeVariaveis4 {
    public static void main(String[] args) throws Exception{

        int numero = 5;
        numero = 10;

        System.out.println("Variável, o numero que está contido na variável: "+numero);

        final int NUMEROCONSTANTE = 20;

        System.out.println("Constante, numero que não muda: "+NUMEROCONSTANTE);


    }
}
