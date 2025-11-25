/* 
3. Pergunte ao usuário a largura e a altura de um retângulo (valores decimais), 
calcule a área do retângulo (largura+altura) e mostre o resultado
*/ 

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        try(Scanner ler = new Scanner(System.in)){

        System.out.println("\nDigite a largura do retângulo:");
        float largura = ler.nextFloat();

        System.out.println("Digite a altura do retângulo:");
        float altura = ler.nextFloat();

        float area = largura * altura;
        System.out.println("Área do retângulo: " +area);

        }
    }
}