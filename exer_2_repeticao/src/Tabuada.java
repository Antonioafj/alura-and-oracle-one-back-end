import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite o numero do qual quer a tabuada: ");
        numero = entrada.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d X %d = %d \n", numero, i, (numero * i));
        }

    }
}
