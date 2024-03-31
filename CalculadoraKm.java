import java.util.Scanner;

public class CalculadoraKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Informe a distância a percorrer (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Informe o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();
   
        double litrosNecessarios = distancia / 12.0;

        double custoTotal = litrosNecessarios * precoLitro;

        System.out.println("Quantidade de litros necessários: " + litrosNecessarios);
        System.out.println("Custo total da viagem: R$" + custoTotal);
        
        scanner.close();
    }
}
