package exercicios;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		System.out.printf("Digite um valor:");
		valor = ler.nextInt();
		// Calcula a centena, dezena e unidade
        int unidade = valor % 10;
        int dezena = (valor / 10) % 10;
        int centena = (valor / 100) % 10;
        
        // Calcula os valores das centenas, dezenas e unidades
        int valorCentena = centena * 100;
        int valorDezena = dezena * 10;
        
        // Exibe os resultados
        System.out.println("Número digitado: " + valor);
        System.out.println("Centena = " + valorCentena);
        System.out.println("Dezena = " + valorDezena);
        System.out.println("Unidade = " + unidade);

	}

}
