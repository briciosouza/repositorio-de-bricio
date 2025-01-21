import java.util.Scanner;

public class nivel1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("digite o valor minimo");
        int valor_minimo = leitor.nextInt();

        System.out.println("digite a contidade maxima");
        int quantidade_maxima = leitor.nextInt();
        
        int media = (valor_minimo + quantidade_maxima) / 2;
        System.out.println("o estoque medio de peças é " + media);

    }
}



    
