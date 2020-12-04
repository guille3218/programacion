package com.company;

import java.util.Arrays;

public class ej4 {
    /*
    Realiza un programa que rellene un array de 5 filas por 9 columnas con
números enteros positivos comprendidos entre 100 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.

     */
    public static void main(String[] args) {
        int[][] v = new int[5][9];
        int max=0;
        String posmax="";
        int min=0;
        String posmin="";

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j]= (int) (Math.random()*901)+100;

                if(i==0 && j==0){
                  max=v[i][j];
                  min=v[i][j];
                }else{
                    if (v[i][j]>max){
                        max=v[i][j];
                        posmax=i+","+j;
                    }
                    if (v[i][j]<min){
                        min=v[i][j];
                        posmin=i+","+j;
                    }
                }
            }
        }

        System.out.println("El máximo es: " +max + " y su posición es: "+ posmax);
        System.out.println("El máximo es: " +min + " y su posición es: "+ posmin);

    }
}
