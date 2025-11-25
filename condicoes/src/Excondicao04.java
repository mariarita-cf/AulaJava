/*
4. Elabore um programa onde o usuário digite uma
letra e o programa informe se a letra é uma vogal ou uma consoante.
*/

import java.util.Scanner;

public class Excondicao04 {
    public static void main(String[] args) {
        
   try(Scanner ler = new Scanner (System.in)) {
    System.out.println("Descubra se a letra é consoante ou vogal");
    System.out.println("Digite uma letra:");
    String letra = ler.nextLine();

    if ("aeiou".contains(letra)) {
        System.out.println("A letra "+letra+" é uma consoante ");
    } else {
        System.out.println("A letra "+letra+" é uma consoante");
    }

        }
    }
}







/*
== com strings nao funcionam. Funcionam para comparar enderecos de memoria

switch (letra) {
    case "a":
    case "e":
    case "i":
    case "o":
    case "u":
        System.out.println("A letra " + letra + " é uma vogal");
        break;

    default:
        System.out.println("A letra " + letra + " é uma consoante");


    usando || com if 

    if (letra.equals("a") || letra.equals("e") || 
    letra.equals("i") || letra.equals("o") || letra.equals("u"))
} */