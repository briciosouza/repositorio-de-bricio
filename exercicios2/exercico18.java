import java.util.Scanner;

public class exercico18 {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    System.out.println("escreva um valor inteiro");
    int numero = leitor.nextInt();
     if (numero != 1 && numero !=2  && numero != 3) {System.out.println("invalido");}
    else if (numero == 1){System.out.println("um");}
    else if (numero == 2){System.out.println("dois");}
    else if (numero == 3){System.out.println("três");}

}
    
}
