import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota da primeira prova: ");
        double notaProva1 = scanner.nextDouble();

        System.out.print("Informe a nota da segunda prova: ");
        double notaProva2 = scanner.nextDouble();

        System.out.print("Informe a nota do trabalho: ");
        double notaTrabalho = scanner.nextDouble();

        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3.0;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        scanner.close();
    }
}
