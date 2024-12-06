public class Dia000Java {
    public static void main(String[] args) {

        String texto = "Java é simples, divertido e poderoso.";
        System.out.println("Texto original: " + texto);
        String[] palavras = texto.split(" ");
        System.out.println("Texto dividido em palavras:");

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }


}
