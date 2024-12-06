import java.util.ArrayList;
import java.util.List;

public class Dia012Java {

    public static void main(String[] args) {

        List<String> listaDeFrutas = new ArrayList<>();

        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");
        listaDeFrutas.add("Uva");

        for (String fruta : listaDeFrutas) {
            System.out.println(fruta);
        }

    }

}
