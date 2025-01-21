import java.util.Scanner;

public class exercicio22 {public static void main(String[] args) {
     Scanner leitor = new Scanner (System.in);
    System.out.println("escreva um valor inteiro");
    int valor = leitor.nextInt();
    if (valor <= 0 ){System.out.println("armazenado em B");}
  else{System.out.println("armazenado em A");};
}
    
}
