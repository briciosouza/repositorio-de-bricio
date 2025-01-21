import java.util.Scanner;

public class exercicioum {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    System.out.println("escreva dois numeros");
  int n1 = leitor.nextInt();
  int n2 = leitor.nextInt();
  if (n1 > n2 ) { int diferença = n1 - n2; System.out.println(" a diferença é de" + diferença );}
 else if (n1 < n2 ) { int diferença2 = n2 - n1; System.out.println(" a diferença é de   " + diferença2 );}

    

}
    
}
