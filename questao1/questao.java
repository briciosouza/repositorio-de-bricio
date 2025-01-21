import java.util.Scanner;

public class questao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int anoAtual = 2024;

        System.out.print("Digite o dia de nascimento:");
        int dias = leitor.nextInt();
        System.out.print("Digite o mes de nascimento:");
        int meses = leitor.nextInt();
        System.out.print("Digite o ano de nascimento:");
        int ano = leitor.nextInt();

        int totalMes = meses * 30;
        int totalAno = (anoAtual - ano) * 365;

        int totalDia = dias + totalMes + totalAno;

        System.out.println("Eu estou vivo a " + totalDia + " dias.");

    }
}