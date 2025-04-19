import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int variavelInt;
        double variavelDouble;

        System.out.println("Digite a variavel Double");
        variavelDouble = scanner.nextDouble();

        variavelInt =(int) variavelDouble;


        System.out.println("Valor com casting " + variavelInt);
    }
}
