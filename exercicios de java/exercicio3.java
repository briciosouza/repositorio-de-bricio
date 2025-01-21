import java.util.Scanner;

public class exercicio3 {
    

public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    String id_vendedor, cod_peca;
    double preco_unitario, valor_comisao, porcentagem = 0.05;
    int qtd_vendida;

    System.out.println("Digite o id do vendedor: ");
    id_vendedor = leitor.nextLine();
    System.out.print("Digite o código da peça: ");
    cod_peca = leitor.nextLine();

    System.out.println("Digite o preço unitátio da peça: ");
    preco_unitario = leitor.nextDouble();

    System.out.println("Digite a quantidade vendida: ");
    qtd_vendida = leitor.nextInt();

    valor_comisao = (preco_unitario * qtd_vendida) * porcentagem;

    System.out.println("A comissão é de: " + valor_comisao);
}
}