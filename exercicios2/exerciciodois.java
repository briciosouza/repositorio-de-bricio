import java.util.Scanner;

public class exerciciodois {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
System.out.println(" escreva suas quatro notas");
 int nota1 = leitor.nextInt();
 int nota2 = leitor.nextInt();
 int nota3 = leitor.nextInt();
 int nota4 = leitor.nextInt();
 int media = (nota1+nota2+nota3+nota4)/4;
 if (media >= 7 ) {System.out.println("você foi aprovado");}
  else if (media < 7 ) {System.out.println("você foi reprovado, escreva sua nota da recuperação");}
  int recuperação = leitor.nextInt();
  int media2 =(media+recuperação)/2;
  if (media2 >= 7 ) {System.out.println("você foi aprovado");}
  else if (media2 < 7 ) {System.out.println("você foi reprovado");}
 
}
    
}
