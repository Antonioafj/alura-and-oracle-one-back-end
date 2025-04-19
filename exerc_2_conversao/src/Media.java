import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int media;
        int nota1, nota2;

        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextInt();

        media = (nota1 + nota2) / 2;

        System.out.println("A média das notas é: " + media);

    }
}
