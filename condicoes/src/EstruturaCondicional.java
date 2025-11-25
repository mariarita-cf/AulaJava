import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) throws Exception {
       
        try (Scanner ler = new Scanner(System.in)){
        int x;
        System.out.println("Digite um número:");
        x = ler.nextInt();
        if(x>18){
            System.out.println("A variavel "+x+" é maior que 18");
            System.out.println("Fim do programa");
        } else if(x == 18){
            System.out.println("A variavel "+x+" é igual a 18");
            System.out.println("Fim do programa");
        } else {
            System.out.println("A variavel "+x+" nao é maior que 18");
            System.out.println("Fim do programa");
        }

        }
    }
}
