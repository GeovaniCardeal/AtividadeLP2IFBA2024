import java.util.Scanner;

public class VerificarTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a temperatura do paciente (em graus Celsius): ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 37) {
            System.out.println("Paciente com febre.");
        } else {
            System.out.println("Temperatura normal.");
        }
        
        scanner.close();
    }
}

