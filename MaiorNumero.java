import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();
        
        double segundoNumero;
        do {
            System.out.print("Informe o segundo número diferente do primeiro: ");
            segundoNumero = scanner.nextDouble();
            if (segundoNumero == primeiroNumero) {
                System.out.println("O segundo número deve ser diferente do primeiro. Tente novamente.");
            }
        } while (segundoNumero == primeiroNumero);
        
        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número é: " + primeiroNumero);
        } else {
            System.out.println("O maior número é: " + segundoNumero);
        }
        
        scanner.close();
    }
}
