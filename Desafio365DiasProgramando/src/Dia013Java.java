import java.util.Scanner;

public class Dia013Java {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de Dados
        String nome;

        System.out.println("Digite o seu primeiro nome: ");

        nome = scanner.nextLine();

        // Processamento
        String processamento = "Olá "+nome+", eu sou o Java.";
        // Saída de Dados
        System.out.println(processamento);
        System.out.println("Processamento finalizado com Sucesso.");

    }
}
