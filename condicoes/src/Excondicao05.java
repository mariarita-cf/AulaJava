
/*
5. Elabore um programa onde o usuário informe a altura
de duas pessoas e o programa retorne quem é mais alto ou se são da mesma altura.
*/

import java.util.Scanner;
public class Excondicao05 {
    public static void main(String[] args) {
        
        try(Scanner ler = new Scanner(System.in)) {
            System.out.println("Vamos descobrir quem é a pessoa mais alta \n" );

            System.out.println("Informacoes da pessoa 1");
            System.out.print("Digite o nome da primeira pessoa: ");
            String nome1 = ler.nextLine();

            System.out.print("Digite a altura da primeira pessoa:" );
            Float altura1 = ler.nextFloat();
            ler.nextLine();

            
            System.out.println("Informacoes da pessoa 2");
            System.out.print("Digite o nome da segunda pessoa: ");
            String nome2 = ler.nextLine();

            System.out.print("Digite a altura da segunda pessoa: ");
            Float altura2 = ler.nextFloat();

            if (altura1 > altura2){
                System.out.println(nome1 + " (" + altura1 + "m) é mais alta que " + nome2 + " (" + altura2 + "m) ");
            } else if (altura1.equals(altura2)) {
                System.out.println(nome1 + " e " + nome2 + " têm a mesma altura ");
            } else {
                System.out.println(nome2 + " (" + altura2 + "m) é mais alta que " + nome1 + " (" + altura1+ "m) ");
            }
        }
    }
    
}
