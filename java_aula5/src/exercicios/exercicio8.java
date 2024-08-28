package exercicios;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        
        // Solicita e lê o valor em Reais
        System.out.print("Digite o valor em Reais: ");
        double valorReais = ler.nextDouble();
        
        // Taxas de câmbio fictícias (esses valores são apenas exemplos e devem ser atualizados conforme as taxas reais)
        double taxaDolar = 5.00; // 1 BRL = 5.00 USD
        double taxaEuro = 5.50;  // 1 BRL = 5.50 EUR
        double taxaPesoArgentino = 0.045; // 1 BRL = 0.045 ARS
        double taxaLibra = 6.00; // 1 BRL = 6.00 GBP
        double taxaIene = 0.037; // 1 BRL = 0.037 JPY
        
        // Conversão dos valores
        double valorDolar = valorReais / taxaDolar;
        double valorEuro = valorReais / taxaEuro;
        double valorPesoArgentino = valorReais / taxaPesoArgentino;
        double valorLibra = valorReais / taxaLibra;
        double valorIene = valorReais / taxaIene;
        
        // Exibe os valores convertidos formatados com duas casas decimais
        System.out.printf("Valor em Dólar Americano: %.2f\n", valorDolar);
        System.out.printf("Valor em Euro: %.2f\n", valorEuro);
        System.out.printf("Valor em Peso Argentino: %.2f\n", valorPesoArgentino);
        System.out.printf("Valor em Libra Esterlina: %.2f\n", valorLibra);
        System.out.printf("Valor em Iene: %.2f\n", valorIene);

	}

}
