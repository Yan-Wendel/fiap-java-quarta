package exercicios;
import java.util.Scanner;
public class exercicio3 {
	public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);
        
        // Solicita e lê o nome do usuário
        System.out.print("Digite seu nome: ");
        String nomeUsuario = ler.nextLine();
        
        // Solicita e lê o gênero do usuário
        System.out.print("Digite seu gênero (M para masculino, F para feminino, O para outro, N para não responder): ");
        char generoUsuario = ler.next().charAt(0);
        
        // Exibe a mensagem final com o nome do usuário e a opção de gênero
        System.out.println("Olá, " + nomeUsuario + "! Você escolheu a seguinte opção de gênero: " + generoUsuario);
        
        // Fecha o scanner
        ler.close();
    }
}
