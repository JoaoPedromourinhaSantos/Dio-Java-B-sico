package edu.joao.Operadores;

public class OperadoresLogicos {
    public static void main (String [] args)throws Exception {
//Lógicos
int numero1 = 1;
int numero2 = 1;

if(numero1== 2 & numero2 ++ == 2 )
    System.out.println("As 2 condições são verdadeiras");

System.out.println("O numero 1 agora é " + numero1);
System.out.println("O numero 2 agora é " + numero2);

// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
    
        boolean cond1 = true;
        boolean cond2 = false;

        if (cond1 && cond2){
            System.out.println("Condições iguais!");
        } else {
            System.out.println("Condições diferentes!");
        }

        if (cond1 || cond2 ){
            System.out.println("Uma condição verdadeira");
        } else {
            System.out.println("Condições falsas!");
        }


        
}

    }
