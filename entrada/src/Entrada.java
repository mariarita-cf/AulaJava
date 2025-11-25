
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {   
        try (Scanner ler = new Scanner(System.in)) {
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();
        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();
        System.out.println("Olá "+nome+", voce tem "+idade+" anos." );
    
    }
    }
}
