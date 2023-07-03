import java.util.ArrayList;
import java.util.List;

public class Dwa {
    public static void main(String[] args) {
        int liczba = 88;
        List<Integer> lista = new ArrayList<>();
        while (liczba > 0) {
            lista.add(0,liczba % 10);
            liczba = liczba / 10;
        }
        if (lista.contains(0) || lista.contains(5)) {
            System.out.println("da sie");
        }
        else {
            System.out.println("nie da sie");
        }
    }
}
