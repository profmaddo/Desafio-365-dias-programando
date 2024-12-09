/**
 * Desafio365
 * Tipos De Dados - Números Ponto Flutuante
 * Este programa solicita ao usuário números decimais e valida a entrada.
 * Permite múltiplas entradas até que o usuário digite "SAIR".
 *
 * Tipos de Dados - Primitivos na Linguagem Java como Exemplo
 * byte: Representa um inteiro de 8 bits, com valores entre -128 e 127
 * short: Representa um inteiro de 16 bits, com valores entre -32.768 e 32.767
 * int: Representa um inteiro de 32 bits, com valores entre -2.147.483.648 e 2.147.483.647
 * long: Representa um inteiro de 64 bits, com valores entre -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807
 * float: Representa um número de ponto flutuante de 32 bits
 * double: Representa um número de ponto flutuante de 64 bits
 * char: Representa um caractere Unicode de 16 bits
 * boolean: Representa um valor booleano (verdadeiro ou falso)
 *
 */
import java.util.Scanner;

public class Dia017Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entradaDeDados;

        System.out.println("Digite números decimais (ou digite 'SAIR' para finalizar):");

        while (true) {
            System.out.print("Entrada: ");
            entradaDeDados = scanner.nextLine();

            if (entradaDeDados.equalsIgnoreCase("SAIR")) {
                System.out.println("Finalizando o programa.");
                break;
            }

            try {
                double numeroDigitado = Double.parseDouble(entradaDeDados); // Tenta converter a entrada para double
                System.out.println("Número válido: " + numeroDigitado);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número decimal.");
            }
        }
        scanner.close();
    }
}

