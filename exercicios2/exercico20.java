import java.util.Scanner;

public class exercico20 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    System.out.println("escreva tres valores maiores que 0");
  int n1 = leitor.nextInt();
  int n2 = leitor.nextInt();
  int n3 = leitor.nextInt();
  int resultado1 = n1 * n2;
  int resultado2 = n1 * n3;
  int resultado3 = n3 * n2;
  int resultado4 = n2 / n1; 
  int resultado5 = n3 / n1;
  int resultado6 = n2 / n3;
  int resultado7 = n1 / n2; 
  int resultado8 = n1 / n3;
  int resultado9 = n3 / n2;
  if(n2 < n3 && n3 < n1) {System.out.println(resultado1 + " ," + resultado7);}
 else if (n3 < n2  && n2 < n1) {System.out.println( resultado2 + " ," +  resultado8);}
 else if (n3 < n1 && n1 < n2) {System.out.println(resultado3 + " ," + resultado6);}
 else if (n1 < n3 && n3 < n2) {System.out.println(resultado1 + " ," + resultado4);}
 else if (n1 < n2 && n2 < n3) {System.out.println(resultado2 + " ," + resultado5);}
  else if (n2 < n1 && n1 < n3) {System.out.println(resultado3 + " ," +  resultado9);};
    
  
 

}

    
}

























    

