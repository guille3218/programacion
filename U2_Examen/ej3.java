package com.company;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        /*
        Ejercicio 3:

Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa debe pedir la altura. Se debe
comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
         */
        Scanner sc= new Scanner(System.in);
        int altura;

        System.out.println("Introduce la altura");
        altura=sc.nextInt();

        if (altura<3 || altura%2==0){
            while(altura<3 || altura%2==0){
                System.out.println("Error, por favor introduzca una altura válida");
                altura=sc.nextInt();
            }
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(j==i || i==altura-1 || i==0 || j==altura/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
