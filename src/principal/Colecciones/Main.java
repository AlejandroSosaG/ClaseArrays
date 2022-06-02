package principal.Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cliente = new Cliente("123456789", "Alejandro");
        Cliente cliente2 = new Cliente("11111111", "Javi");
        Cliente cliente3 = new Cliente("22222222", "Ruben");
        clientes.add(cliente);
        if (clientes.contains(new Cliente("123456789", "David")) == true) {
            System.out.println("Correcto");
        }
        Iterator iterator = (Iterator) clientes.iterator();

        for (;iterator.hasNext();) {
            Cliente p = (Cliente) iterator.next();
            System.out.println(p);
        }
        Iterator<Cliente> iterador = clientes.iterator();
        while (iterator.hasNext()){
            Cliente p=iterador.next();
            if (p.dni.equals(123456789)){
                iterator.remove();
            }
        }
        ListIterator listIterator= clientes.listIterator();
        while (listIterator.hasPrevious()){
            Cliente n= (Cliente) listIterator.previous();
            if (n.dni.equals(11111111)){
                listIterator.remove();
            }
        }
    }
}
