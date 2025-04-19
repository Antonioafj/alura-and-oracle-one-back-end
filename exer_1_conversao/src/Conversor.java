import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 

        int temperaturaCelsius;
        double temperaturaFahrenhit;

        System.out.println("Digite a tempera tura em Celsius: ");
        temperaturaCelsius = scanner.nextInt();

        temperaturaFahrenhit = (double)(temperaturaCelsius * 1.8 ) + 32;
        
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenhit);
        
        scanner.close();
    }
}
