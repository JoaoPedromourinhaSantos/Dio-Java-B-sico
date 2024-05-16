package edu.joao.tiposevariaveis;

public class TiposeVariaveis2 {
    public static void main(String [] args) throws Exception{
    double salarioMinimo = 2.500;

    System.out.println(salarioMinimo);

    byte idade = 123;
    short ano = 2021;
    int cep = 3219421; // se começar com 0, mudar o tipo
    long cpf =9321838421L; // se começar com 0, mudar o tipo / deve ser encerrado com L para representar em tipo longo e não inteiro.
    float pi =3.14F; //para usar o tipo float, tem q colocar o "F" no final.


    System.out.println("A idade é: " + idade);
    System.out.println("O ano é: " + ano);
    System.out.println("O cep é: " + cep);
    System.out.println("O cpf é: " + cpf);
    System.out.println("O valor de pi é: " + pi);

        short numeroCurto = 1;
        int numeroNormal =numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting
    
    System.out.println(numeroCurto2);
    }
}
