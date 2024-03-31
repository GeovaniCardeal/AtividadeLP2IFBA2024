import java.util.Scanner;

public class VerificarObesidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a altura (em metros): ");
        double altura = scanner.nextDouble();

        double alturaQuadrado = altura * altura;
        double imc = peso / alturaQuadrado;

        if (imc > 30) {
            System.out.println("Você está obeso.");
        } else {
            System.out.println("Você não está obeso.");
        }
        
        scanner.close();
    }
}
