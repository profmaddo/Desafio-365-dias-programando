public class Dia010Java {

    public static void main(String[] args) {

        String texto = "Java é simples, divertido e poderoso.";
        System.out.println("Texto original: " + texto);
        String[] textos = texto.split(" ");


        System.out.println("*** Exemplo 1");
        for (int i = 0; i < textos.length; i++) {
            System.out.println(textos[i]);
        }

        System.out.println("*** Exemplo 2");
        for(String palavra : textos) {

            System.out.println(palavra);
        }


    }
}
