import java.util.Scanner;

public class exercico10 {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    System.out.println("escreva dois números inteiros");

    int numero = leitor.nextInt();
    int numero2 = leitor.nextInt();
    
    if (numero <= numero2) { System.out.println("o primeiro numero é igual ou menor o segundo numero");}
    else{ System.out.println("o primeiro numero é diferente e/ou maior que o segundo");}
    
        
    }
}
    

