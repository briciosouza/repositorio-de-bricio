import java.util.Scanner;

public class exercicio9 {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);

   System.out.println("escreva o ano em que voce nasceu");
   int ano = leitor.nextInt();

   System.out.println("escreva o dia em que voce nasceu");
   int dia = leitor.nextInt();

   System.out.println("escreve o mes em que voce nasceu");
   int mes = leitor.nextInt();

   int ano_atual = 2024;
   int mes_real = mes* 30;
   int ano_real = (ano_atual - ano)  * 365;
   int dias_totais = ano_real + mes_real + dia;
   
   System.out.println(" você nasceu a " + dias_totais +  " dias ");


   
}
    
}
