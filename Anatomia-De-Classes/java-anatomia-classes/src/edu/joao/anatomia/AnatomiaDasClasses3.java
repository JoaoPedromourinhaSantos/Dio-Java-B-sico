package edu.joao.anatomia;
public class AnatomiaDasClasses3 {
    
    int idade =23;
    double altura =1.62;
    
    String meuNome= "Moura";
    int anoFabricacao = 2022;

    boolean Testar = true;

    public static void main (String [] args) {
        String primeiroNome = "João";
        String segundoNome = "Moura";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}


