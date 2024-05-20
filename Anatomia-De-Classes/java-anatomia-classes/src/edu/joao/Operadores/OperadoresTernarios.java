package edu.joao.Operadores;

public class OperadoresTernarios {
    
    public static void main(String[] args) {
        // como se fosse um IF, só q é tudo na mesma linha
        int numero1 = 2;
        int numero2 =3;

        String resultado ="";

        resultado = numero1 == numero2 ? "Verdadeiro, são iguais!" : "falso, os numeros não são iguais!";

        System.out.println(resultado);
    }
}
