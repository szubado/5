import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Jeden {
    public static void main(String[] args) {
        int liczba = 777912;
        List<Integer> numer = new ArrayList<>();
        while (liczba > 0) {
            numer.add(0, liczba % 10);
            liczba = liczba / 10;
        }
        System.out.println(numer);
        //uzupelniamy zerami nowa liste
        List<Integer> najwiecej = new ArrayList<>();
        for (int k = 0; k < 11; k++) {
            najwiecej.add(0);
        }
        System.out.println(najwiecej);
        //przedstawiamy ilosc wystepowan w numerze tych samych cyfr pod konkretnymi indexami listy najwiecej
        for (int i = 0; i < numer.size(); i++) {
            int liczba2 = 1;
            if(najwiecej.get(numer.get(i)) != 0) {
                liczba2++;
            }
            najwiecej.set(numer.get(i),liczba2);
        }
        System.out.println(najwiecej);
        // sprawdzamy jaka jest najwieksza ilosc powtorzen cyfr
            int max = 0;
            for (int i = 0; i < najwiecej.size(); i++) {
                if (najwiecej.get(i) > max) {
                    max = najwiecej.get(i);
                }
            }
            int operacje = numer.size() - max;
        System.out.println("najwiecej powtorzen: " + max);
            System.out.println("operacji do wkonania mamy: " + operacje);
    }
}
