package edu.joao.Operadores;

public class OperadoresRelacionais {
    
    public static void main(String[] args) {
        int numero1 =1;
        int numero2 =2;

        boolean simNao = numero1 == numero2;

        System.out.println("NUMERO 1 é igual ao Numero 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NUMERO 1 é diferente ao Numero 2? " + simNao);

        if (numero1 > numero2){
            System.out.println("Verdadeiro!");
        } else {
            System.out.println("Falso!");
        }

    }
}
