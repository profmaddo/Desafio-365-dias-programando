import java.util.Scanner;

public class Dia014Java {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de Dados
        String nome = "";

        while (!nome.equalsIgnoreCase("SAIR")) {

            System.out.println("Digite o seu primeiro nome (ou digite 'SAIR' para finalizar): ");

            nome = scanner.nextLine();

            // Validações
            if(nome.equalsIgnoreCase("SAIR")) {
                System.out.println("Processamento finalizado com Sucesso.");
                break;
            }

            // Processamento
            String processamento = "Olá " + nome + ", eu sou o Java.";
            // Saída de Dados
            System.out.println(processamento);

        }

    }
}
