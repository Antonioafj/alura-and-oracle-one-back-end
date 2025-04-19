import java.util.Scanner;

public class Dollars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorEmDolares;
        double dolar = 4.94;

        System.out.println("Digite a quantidade de dollars: ");
        valorEmDolares = scanner.nextDouble();


        System.out.println("O valor é " + valorEmDolares * dolar +" reais");
    }
}
