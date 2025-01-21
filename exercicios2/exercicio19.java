import java.util.Scanner;

public class exercicio19 {public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);

System.out.println("digite o valor do lado A");
int A =leitor.nextInt();
System.out.println("digite o valor do lado B");
int B =leitor.nextInt();
System.out.println("digite o valor do lado C");
int C =leitor.nextInt();
if (A< B + C && B < A + C && C<A + B ){if (A==B && B == C )
    {System.out.println("O triangulo é equilatero");}
 else if (A==B||A==C|| B == C){System.out.println("o triangulo é isoceles");}
 else {System.out.println("eo triangulo é escaleno");}}
 else { System.out.println("os valores fornecidos não formam um triangulo");}

























}
    
}
