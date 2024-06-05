package edu.joao.ContaBanco.Console;
//Simulando Uma Conta Bancária Através Do Terminal/Console Desafio!

//Classe scanner importada
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[]args){
        //setando classe scanner
		Scanner terminal = new Scanner(System.in);

                //Exibindo mensagens para o usuário
        System.out.println("Dgite o nome do solicitante da agência: ");
        //Obtendo valores digitados
        String Nome = terminal.nextLine();

                //Exibindo mensagens para o usuário
        System.out.println("Digite qual a sua agência: ");
        //Obtendo valores digitados
        String Agencia = terminal.nextLine();

                //Exibindo mensagens para o usuário
        System.out.println("Digite o numero da agência: ");
        //Obtendo valores digitados
        int Numero = terminal.nextInt();

                //Exibindo mensagens para o usuário
        System.out.println("Digite o saldo desejado para o saque: ");
        //Obtendo valores digitados
        float saldo = terminal.nextFloat();


        
        //Exibindo a mensagem da conta criada para o usuário!
        System.out.println("Olá " +Nome.concat(" Obrigado por criar uma conta em nosso banco, sua agência é " +Agencia).concat(", conta " +Numero).concat(" e seu saldo de "+saldo).concat(" já está disponível para saque, gaste com moderação!") );
        terminal.close();
    }
}
