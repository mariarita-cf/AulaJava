/*
1 - Elaborar um programa onde o usuario digite sua idade, caso seja menor de 18, 
apareca a mensagem proibida a entrada
*/

import java.util.Scanner;
public class Excondicao01 {
    public static void main(String[] args) {
        
        try(Scanner entrada = new Scanner(System.in)){
        System.out.println("Qual a sua idade:");
        int idade = entrada.nextInt();
        
        if (idade >= 18) {
            System.out.println("Entrada Liberada!");
            System.out.println("Curta a festa");
        } else {
            System.out.println("Entrada Proibida!");   
        }

         }
    }
}
