package exercicios;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			int dia,mes,ano;
			System.out.println("Digite o dia: ");
			dia = ler.nextInt();
			System.out.println("Agora o mes: ");
			mes = ler.nextInt();
			System.out.println("O ano: ");
			ano = ler.nextInt();
			//Calculo do tempo
			int tempoA = 365 * ano;
			int tempoM = 30 * mes;
			int tempototal = (tempoA + tempoM)+dia;
			System.out.printf("Vc viveu: "+ tempototal +" dias.");
	}

}
