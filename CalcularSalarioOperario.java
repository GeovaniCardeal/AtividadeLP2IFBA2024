import java.util.Scanner;

public class CalcularSalarioOperario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas trabalhadas no mês pelo operário: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salario = horasTrabalhadas * 20.0;

        System.out.println("O salário do operário é: R$" + salario);
        
        scanner.close();
    }
}
