import java.util.Scanner;

public class exercicio5 {public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);

    System.out.println( "escreva a velocidade media do veiculo ");
    int velocidade_media = leitor.nextInt();

    System.out.println( "escreva o tempo de viagem em horas ");
    int tempo = leitor.nextInt();

    int distancia = tempo * velocidade_media;
    int resultado = distancia * 12 ;
    
     System.out.println("gasolina necessesaria para a viagem igual a " +  resultado + " litros");


}
    
}
