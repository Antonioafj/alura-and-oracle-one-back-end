import java.util.Scanner;

public class Preco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco, valorTotal;
        int quantidade;

        System.out.println("Digite o preço do produto:");
        preco = scanner.nextDouble();

        System.out.println("Digite a quantidade:");
        quantidade = scanner.nextInt();

         valorTotal = preco * quantidade;

        System.out.println("O valor toda dos produtos é: " + valorTotal);

    }
}

