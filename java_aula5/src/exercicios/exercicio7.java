package exercicios;
import java.util.Scanner;
public class exercicio7 {
/*Crie um programa que receba o valor do produto e valor pago. 
 Calcule o troco a ser pago. O valor do troco deve ser exibido no terminal.*/
	public static void main(String[] args) {
		//crie um scanner.
		Scanner ler = new Scanner(System.in);
		double preco, pago;
		//lendo preço e valor pago.
		System.out.print("Valor do produto: ");
		preco = ler.nextDouble();
		System.out.print("Dinheiro transferido: ");
		pago = ler.nextDouble();
		//calcular troco e mostrar.
		
		double troco = pago - preco;
		System.out.printf("Seu troco: R$ %.2f\n", troco);
	}

}
