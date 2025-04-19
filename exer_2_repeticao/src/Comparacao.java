import java.util.Scanner;

public class Comparacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite um numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite outro numero: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.printf("Os numero digitados %d e %d são iguais ", numero1, numero2);
        } else if (numero1 < numero2) {
            System.out.printf("O primeiro numero digitado %d é menor que o segundo %d ", numero1, numero2);
        }else {
            System.out.printf("O primeiro numero digitado %d é maior que o segundo %d", numero1, numero2);

        }

    }
}
