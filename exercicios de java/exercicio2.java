import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        double cotacao_de_dolar= 5.12;
        System.out.print("insira o valor que você deseja converter ");

        double valor_dolar = leitor.nextDouble();
        double valor_conver = valor_dolar * cotacao_de_dolar;
        System.err.print("o valor convertido é " + valor_conver);
    }
}
