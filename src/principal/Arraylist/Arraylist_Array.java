package principal.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Array {
    public static void main(String[] args) {
        ArrayList lista= new ArrayList();
        lista.add(5);
        lista.add(2);
        lista.add(3);
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);
    }
}
