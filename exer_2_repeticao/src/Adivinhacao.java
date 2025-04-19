import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aleatorio = new Random().nextInt(5);
        int contador = 0;
        int tentativa =0;

        while (contador < 5) {
            System.out.printf("Tentativa %d ", contador + 1);
            tentativa = scanner.nextInt();

            if (tentativa == aleatorio) {
                System.out.println("Caraca...Você adivinhou o numero");
                break;
            } else if (tentativa > aleatorio) {
                System.out.println("O numero a ser adivinhado é menor!");
            } else {
                System.out.println("O numero a ser adivinhado é maior!");
            }

            contador++;
        }
        if (tentativa != aleatorio) {
            System.out.println("Bicho! Tu errou tudo");
        }
    }
}
