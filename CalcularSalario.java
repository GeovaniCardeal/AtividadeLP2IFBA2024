import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da hora aula do professor: ");
        double valorHoraAula = scanner.nextDouble();

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Informe o percentual de desconto do INSS (%): ");
        double percentualINSS = scanner.nextDouble();

        double salarioBruto = valorHoraAula * horasTrabalhadas;

        double descontoINSS = salarioBruto * (percentualINSS / 100.0);

        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("O salário líquido do professor é: R$" + salarioLiquido);
        
        scanner.close();
    }
}
