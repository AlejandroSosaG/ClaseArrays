package principal;

import java.util.Arrays;

public class Practica {
    public static void main(String[] args){
            char[] letras ={'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j'};
        System.out.println("La letra f se encuentra en la posición "+ Arrays.binarySearch(letras, 'f'));
        System.out.println("La letra h se inserta en la posición "+ (-Arrays.binarySearch(letras, 'h')-1));
        char[] letras2 = new char[letras.length+10];
        letras2=Arrays.copyOf(letras, letras2.length);
    }
}
