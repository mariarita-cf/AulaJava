/*
2. Refaça o programa anterior mostrando entrada proibida se o usuário
for menor de 18 anos e seja bem vindo se o usuário tiver 18 anos ou mais.
*/

import java.util.Scanner;
public class Excondicao02 {
    public static void main(String[] args) {
        
        try(Scanner entrada = new Scanner(System.in)){
        System.out.println("Qual a sua idade:");
        int idade = entrada.nextInt();
        
        if (idade >= 18) {
            System.out.println("Entrada Liberada!");
            System.out.println("Seja Bem-vindo :) Curta a festa !!!");
        } else {
            System.out.println("Entrada Proibida!");   
        }

         }
    }
}