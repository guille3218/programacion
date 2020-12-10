package com.company;

import java.util.Arrays;

public class ej3 {
    /*
    Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países. El array que contiene los nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}.
    Los datos sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas con
    números aleatorios generados al azar entre 140 y 210. Los decimales de la media se pueden despreciar.
     Los nombres de los países se deben mostrar utilizando el array de países (no se pueden escribir directamente).
     */

    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] estatura = new int[4][10];
        int sum=0;
        int max=0;
        int min=0;

        System.out.println("                                                  MED MIN MAX");
        for (int i = 0; i < estatura.length; i++) {
            System.out.print(pais[i]+": ");

            for (int j = 0; j < estatura[i].length; j++) {
                estatura[i][j]= (int) (Math.random()*(210-140)+1)+140;
                System.out.print(estatura[i][j]+" ");

                sum=sum+estatura[i][j];

                if (i==0 && j==0){
                    max=estatura[i][j];
                    min=estatura[i][j];
                }else{
                    if (estatura[i][j]>max){
                        max=estatura[i][j];
                    }
                    if (estatura[i][j]<min){
                        min=estatura[i][j];
                    }
                }

            }

            System.out.print("| "+sum/estatura[i].length+" "+min+" "+max);

            System.out.println();
        }

    }
}
