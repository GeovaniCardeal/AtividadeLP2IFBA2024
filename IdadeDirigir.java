import java.util.Scanner;

public class IdadeDirigir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        if (idade > 18) {
            System.out.println("Você já pode tirar a carteira de motorista.");
        } else {
            System.out.println("Você ainda não pode tirar a carteira de motorista.");
        }
        
        scanner.close();
    }
}
