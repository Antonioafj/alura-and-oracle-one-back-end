import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        if (numero < 0){
            System.out.println("O numero digitado é negativo");
        }else {
            System.out.println("O numero digitado é positivo");
        }
    }
}
