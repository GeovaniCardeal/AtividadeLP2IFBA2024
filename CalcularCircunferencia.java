import java.util.Scanner;

public class CalcularCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("A área da circunferência é: " + area);
        
        scanner.close();
    }
}
