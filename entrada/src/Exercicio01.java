/* 
1. Crie um programa que peça a entrada do nome do aluno e 4 notas, 
então ele deve calcular essas notas e entrar a média
*/ 

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
       try(Scanner ler = new Scanner(System.in)) {
        System.out.println("Digite o nome do aluno:");
        String nome = ler.nextLine();

        float nota1, nota2, nota3, nota4, media;
       
        System.out.println("Digite a nota 1:");
        nota1 = ler.nextFloat();
        System.out.println("Digite a nota 2:");
        nota2 = ler.nextFloat();
        System.out.println("Digite a nota 3:");
        nota3 = ler.nextFloat();
        System.out.println("Digite a nota 4:");
        nota4 = ler.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf(" Aluno: %s \n Média: %.1f", nome, media);
       }
    }
}