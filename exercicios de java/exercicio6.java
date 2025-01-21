import java.util.Scanner;

public class exercicio6 {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);

    System.out.println( "escreva a temperatura em graus Celsius ");
    int C = leitor.nextInt();
    int F = (9 * C + 160) / 5;
    
    System.out.println("a temperatura em Fahrenheit é " + F);
}
    
}
