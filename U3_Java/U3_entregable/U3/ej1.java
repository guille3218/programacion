package U3;

import java.util.Arrays;

public class ej1 {
    /*
    Define la función mezcla con la siguiente cabecera:

public static int[] mezcla(int[] a, int[] b)

Esta función toma dos vectores como parámetros y devuelve un array que es el resultado
de mezclar los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a, etc. Los vectores
 y b pueden tener longitudes diferentes; por tanto, si se terminan los números de un array se terminan de coger todos
 los que quedan del otro.
    */

    public static void main(String[] args) {
        int[] a = {8,9,0,3};
        int[] b = {1};

        System.out.println(Arrays.toString(mezcla(a,b)));

    }
    public static int[] mezcla(int[] a, int[] b){
        int[] mezcla = new int[a.length+b.length];
        int c=0;
        int c2=0;

        while (c < mezcla.length) {
            if(c2 < a.length) {
                mezcla[c] = a[c2];
                c++;
            }
            if(c2 < b.length){
                mezcla[c] = b[c2];
                c++;
            }
            c2++;
        }

        return mezcla;
    }
}
