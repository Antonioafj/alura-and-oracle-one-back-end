import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.println("""
                Digite uma das opções abaixo:
                1. Calcular área do quadrado 
                2. Calcular área do círculo
                """);
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o comprimento do lado do quadrado");
                int lado = entrada.nextInt();
                int areaQuadrado;
                areaQuadrado = (lado * lado);
                System.out.println("A área de quadrado é " + areaQuadrado);
                break;
            case 2:
                System.out.println("Digite o raio do circulo");
                int raio = entrada.nextInt();
                double areaCirculo;
                areaCirculo = 3.14 * (raio * raio);
                System.out.println("A área de quadrado é " + areaCirculo);
                break;

            default:
                System.out.println("Numero digitado invalido!");
                break;
        }

    }
}
