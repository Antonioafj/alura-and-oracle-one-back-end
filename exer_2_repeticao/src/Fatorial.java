import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fatorial = 1 ;

        System.out.println("Digite o numero do fatorial");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial é " + fatorial);
    }

}
