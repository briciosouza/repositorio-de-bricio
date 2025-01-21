import java.util.Scanner;

public class exercicio16 {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    System.out.println("escreva dois numeros");
    int n1 = leitor.nextInt();
    int n2 = leitor.nextInt();
    if (n1 >  n2){System.out.println( n1 + "  é maior que  " + n2);}
    else if (n1 <  n2){System.out.println( n2 + "  é maior que  " + n1);}
    else if (n1 == n2) {System.out.println("os numeros são iguais"); }
}
    
}
