package principal.Arraylist;

import java.util.Comparator;

public class CompareNombres implements Comparator<Clientes> {
    public static void main(String[] args) {
        @Override
        public int compare(Clientes cliente1, Clientes cliente2){
            return cliente1.getNombre().compareTo(cliente2.getNombre());
        }
    }
}
