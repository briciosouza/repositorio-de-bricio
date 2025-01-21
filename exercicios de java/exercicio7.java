import java.util.Scanner;

public class exercicio7 {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    
    System.out.println( "escreva a temperatura em graus Fahrenheit Celsius ");
    int F= leitor.nextInt();
    int C = (F - 32) * 5 / 9;
    System.out.println("a temperatura em Celsius é " + C);
}
}
    

