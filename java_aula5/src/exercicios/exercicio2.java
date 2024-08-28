package exercicios;
/*Elabore um programa que declare um número inteiro, float e double.*/
public class exercicio2 {
	public static void main(String[] args) {
        // Declara e inicializa variáveis de diferentes tipos
        int numeroInteiro = 42;
        float numeroFloat = 3.14f;
        double numeroDouble = 2.718281828459045;
        
        // Exibe os valores das variáveis
        System.out.println("Valor inteiro: " + numeroInteiro);
        System.out.println("Valor float: " + numeroFloat);
        System.out.println("Valor double: " + numeroDouble);
        
        // Converte os valores para String
        String numeroInteiroString = Integer.toString(numeroInteiro);
        String numeroFloatString = Float.toString(numeroFloat);
        String numeroDoubleString = Double.toString(numeroDouble);
        
        // Exibe os valores convertidos para String
        System.out.println("\nValor inteiro como String: " + numeroInteiroString);
        System.out.println("Valor float como String: " + numeroFloatString);
        System.out.println("Valor double como String: " + numeroDoubleString);
    }
}
