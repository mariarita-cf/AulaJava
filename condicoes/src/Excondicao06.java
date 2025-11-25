/*
6. Faça um programa onde o usuário entre com seu peso, e altura e o programa mostre o IMC e uma das seguintes frases: 
IMC menor que 17 muito abaixo do peso, IMC maior que 17 e menor que 18.5 abaixo do peso, 
IMC maior que 18.5 e menor que 25 parabéns peso ideal, IMC maior 25 e menor que 30 acima do peso, 
IMC maior que 30 e menor que 35 Obesidade 1,
IMC maior que 35 e menor que 40 Obesidade 2 (severa), IMC maior que 40 Obesidade 3 (mórbida)
*/


import java.util.Scanner;

public class Excondicao06 {
    public static void main(String[] args) {

        try (Scanner ler = new Scanner(System.in)) {

            System.out.print("Digite seu peso (kg): ");
            float peso = ler.nextFloat();

            System.out.print("Digite sua altura (m): ");
            float altura = ler.nextFloat();

            float imc = peso / (altura * altura);

            System.out.printf("Seu IMC é: %.2f \n", imc);

            System.out.print("Classificação: ");

            if (imc < 17) {
                System.out.println("Muito abaixo do peso");
            } else if (imc >= 17 && imc < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 18.5 && imc < 25) {
                System.out.println("Parabéns! Peso ideal");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("Acima do peso");
            } else if (imc >= 30 && imc < 35) {
                System.out.println("Obesidade I");
            } else if (imc >= 35 && imc < 40) {
                System.out.println("Obesidade II (severa)");
            } else {
                System.out.println("Obesidade III (mórbida)");
            }

        }
    }
}

