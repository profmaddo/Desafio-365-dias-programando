package maddo;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class LeitorDeTXT {
    public static void main(String[] args) {
        // Caminho do arquivo que será lido
        String caminhoArquivo = "lista_de_uf.txt";

        try {
            // Lê todas as linhas do arquivo em uma lista de strings
            List<String> linhas = Files.readAllLines(Path.of(caminhoArquivo));

            try {
                // Itera sobre cada linha do arquivo
                for (String linha : linhas) {
                    // Verifica se a linha não é o cabeçalho (primeira linha do exemplo)
                    if (!linha.startsWith("UF")) {
                        // Divide a linha usando a vírgula como separador
                        String[] partes = linha.split(",");

                        // Imprime as partes separadas por tabulação (4 espaços)
                        System.out.println(partes[0] + "    " + partes[1]);
                    }
                }
            }catch (Exception error){
                System.out.println("Erro ao ler arquivo: " + caminhoArquivo);
                System.out.println("Esperado , encontrado ; ");
            }
        } catch (IOException e) {
            // Trata erros de entrada/saída, como o arquivo não encontrado
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
