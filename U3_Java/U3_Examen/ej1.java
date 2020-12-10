package com.company;

import java.util.Arrays;

public class ej1 {
    /*
    Define la función esta  con la siguiente cabecera:

public static boolean esta(int[] vector, int num)

Que nos devuelva si un elemento está en un vector(array) unidimensional.

Usar dicho elemente para construir la siguiente función:

public static int[] unirSinRepetidos(int v1[],int[] v2)

Que una los dos vectores pero sin elementos repetidos. Usar dicha función en el método
main mostrando el vector resultado por pantalla.
     */
    public static void main(String[] args) {
        int[] v1={1,2,3};
        int[] v2={3,2,5};

        System.out.println(Arrays.toString(unirSinRepetidos(v1,v2)));

    }
    public static boolean esta(int[] vector, int num){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==num){
                return true;
            }
        }
        return false;
    }
    public static int[] unirSinRepetidos(int v1[],int[] v2){
        int[] mezcla = new int[v1.length+v2.length];
        int c=0;

        for (int i = 0; i < mezcla.length; i++) {
            if (i<v1.length){
                mezcla[i]=v1[i];
            }
        }
        for (int i = v1.length; i < mezcla.length; i++) {

            if (c<v2.length){
                if (esta(v1,v2[c])==false){
                    mezcla[i]=v2[c];
                }
                c++;
            }

        }
        return mezcla;

    }
}
