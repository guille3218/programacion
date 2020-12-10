package com.company;

import java.util.Arrays;

public class ej4 {
    /*
    Crear una función unirMatrices que reciba dos matrices bidimensionales de cadenas y
     devuelva la unión de las dos matrices.

Si la matrices no tiene la misma dimensión deberá devolver un vector bidimensional vacio.
     */

    public static void main(String[] args) {
        String[][] a={{"HOLA","PERRO","C++"},{"ADIOS","GATO","PYTHON"},{"HASTA LUEGO","VACA","JAVA"}};
        String[][] b={{"BD","LM","PROG"},{"SOBRESALIENTE","NOTABLE","APROBADO"},{"PEPE","MANUEL","ROSA"}};

        String[][] union={};
        union=unirMatrices(a,b);

        for (int i = 0; i < union.length; i++) {
            for (int j = 0; j < union[i].length; j++) {
                System.out.print(union[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static String[][] unirMatrices(String[][] a, String[][] b){
       if (a.length==b.length && a[0].length==b[0].length){
           String[][] union= new String[a.length][a[0].length+b[0].length];
           int c=0;

           for (int i = 0; i < union.length; i++) {
               for (int j = 0; j < union[i].length; j++) {
                   if (j<a[i].length){
                       union[i][j]=a[i][j];
                   }
               }
               for (int j = a[i].length; j < union[i].length; j++) {
                   if (c<b[i].length){
                       union[i][j]=b[i][c];
                       c++;
                   }
               }
           }

           return union;
       }
       else{

           String[][] union = {};
           return union;
       }



    }
}
