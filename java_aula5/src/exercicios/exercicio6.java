package exercicios;
import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);
        
        // Declaração das variáveis para a peça 1
        String nomePeca1;
        int numeroPecas1;
        double valorUnitarioPeca1;
        
        // Declaração das variáveis para a peça 2
        String nomePeca2;
        int numeroPecas2;
        double valorUnitarioPeca2;
        
        // Solicita e lê as informações para a peça 1
        System.out.print("Digite o nome da peça 1: ");
        nomePeca1 = ler.nextLine();
        
        System.out.print("Digite o número de peças 1: ");
        numeroPecas1 = ler.nextInt();
        
        System.out.print("Digite o valor unitário da peça 1: ");
        valorUnitarioPeca1 = ler.nextDouble();
        
        // Limpa o buffer do Scanner
        ler.nextLine();
        
        // Solicita e lê as informações para a peça 2
        System.out.print("Digite o nome da peça 2: ");
        nomePeca2 = ler.nextLine();
        
        System.out.print("Digite o número de peças 2: ");
        numeroPecas2 = ler.nextInt();
        
        System.out.print("Digite o valor unitário da peça 2: ");
        valorUnitarioPeca2 = ler.nextDouble();
        
        // Calcula o valor total a ser pago
        double valorTotalPeca1 = numeroPecas1 * valorUnitarioPeca1;
        double valorTotalPeca2 = numeroPecas2 * valorUnitarioPeca2;
        double valorTotal = valorTotalPeca1 + valorTotalPeca2;
        
        // Exibe o valor total a ser pago
        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);

	}

}