public class Dia007Java {

    public static void main(String[] args) {

        String textoA = "Desafio 365";
        String textoB = "desafio 365";

        System.out.println("Texto A: " + textoA);
        System.out.println("Texto B: " + textoB);

        System.out.println("Os texto são iguais? " + (textoA.equals(textoB)));
        System.out.println("Os texto são iguas ignorando maiúsculas e minúsculas? " + (textoA.equalsIgnoreCase(textoB)));


    }
}
