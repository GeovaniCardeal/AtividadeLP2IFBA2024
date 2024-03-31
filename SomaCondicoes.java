import java.util.Scanner;

public class SomaCondicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor numérico: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor numérico: ");
        double valor2 = scanner.nextDouble();

        double soma = valor1 + valor2;

        if (soma >= 10) {

            soma += 5;
        } else {

            soma -= 7;
        }

        System.out.println("O resultado final é: " + soma);
        
        scanner.close();
    }
}
