/* 
2. Crie um programa que receba dois números
e apresente a adição, subtração, multiplicação e divisão desses números 
*/ 

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("\nDigite o primeiro número:");
            float num1 = ler.nextFloat();

            System.out.println("Digite o segundo número:");
            float num2 = ler.nextFloat();

            System.out.printf("Adição: %.1f\n", num1 + num2);
            System.out.printf("Subtração: %.1f\n", num1 - num2);
            System.out.printf("Multiplicação: %.1f\n", num1 * num2);
            System.out.printf("Divisão: %.1f\n", num1 / num2);
        }
    }
}
