/*
3. Elabore um programa onde o usuário digite um número e o 
programa informe se o número é par ou impar.
*/


import java.util.Scanner;

public class Excondicao03 {
    public static void main(String[] args) {
        
        try(Scanner ler = new Scanner(System.in)){
            System.out.println("Descubra se o número é impar ou par");
            System.out.println("Digite um número:");
            int numero = ler.nextInt();
            
            if(numero %2 == 0) {
                System.err.println("O número "+numero+" é par");
            } else {
                System.out.println("O número "+numero+" é ímpar");
            }

        }
    }
}
