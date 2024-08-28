package exercicios;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
        try (// Cria um objeto Scanner para ler a entrada do usuário
		Scanner ler = new Scanner(System.in)) {
			// Declaração das variáveis
			double notaA, notaB;
			double pesoA = 3.0; // primeira nota
			double pesoB = 7.0; // segunda nota
			
			// Solicita e lê a primeira nota
			System.out.print("Digite a primeira nota (A): ");
			notaA = ler.nextDouble();
			
			// Solicita e lê a segunda nota
			System.out.print("Digite a segunda nota (B): ");
			notaB = ler.nextDouble();
			
			// Calcula a média ponderada
			double mediaPonderada = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB);
			
			// Exibe a média ponderada
			System.out.printf("A média ponderada é: %.2f\n", mediaPonderada);
		}
	}
}