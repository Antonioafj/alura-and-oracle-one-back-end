import java.util.Scanner;

public class Percentual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoOriginal, percentualDesconto, valorComDesconto;

        System.out.println("Digite o valor do produto:");
        precoOriginal = scanner.nextDouble();

        System.out.println("Digite o percentual de desconto:");
        percentualDesconto = scanner.nextDouble();

        valorComDesconto = precoOriginal * (1- (percentualDesconto / 100) );

        System.out.println("O valor com desonto fica " + valorComDesconto + " reais");
    }
}
