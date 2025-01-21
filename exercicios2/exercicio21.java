import java.util.Scanner;

public class exercicio21 {public static void main(String[] args) {
     Scanner leitor = new Scanner (System.in);
    System.out.println("escreva um valor inteiro");
    int valor = leitor.nextInt();
    if (valor <= 0 ){System.out.println("numero negativo");}
  else{System.out.println("numero positivo");};
}
    
}
