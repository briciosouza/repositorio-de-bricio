import java.util.Scanner;

public class exercicio8 {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);

    System.out.println("escreva o raio da lata");
    double raio = leitor.nextInt();

    System.out.println("escreva a altura da lata");
    double a= leitor.nextInt();

    double v = 3.14159 * raio * raio * a;
    
    System.out.println("o volume da lata é de " + v);

}
    
}
