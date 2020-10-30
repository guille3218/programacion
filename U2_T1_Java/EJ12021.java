package com.company;

import java.util.Scanner;

public class EJ12021 {
    public static void main(String[] args) {
        /*
        Ejercicio 1:
Escribe un programa que pinte por pantalla un par de calcetines, de los que se ponen al lado del árbol de Navidad paraque Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.

Ejemplo 1:
Introduzca la altura de los calcetines: 6

***      ***
***      ***
***      ***
***      ***
******  ******
******  ******


Ejemplo 2:
Introduzca la altura de los calcetines: 4


***      ***
***      ***
******  ******
******  ******
         */
        Scanner sc = new Scanner(System.in);
        int alt;

        System.out.println("Introduce la altura. Debe de ser mayor o igual a 4");
        alt = sc.nextInt();

        while(alt<4){
            System.out.println("Altura incorrecta, introduce una altura mayor o igual a 4");
            alt=sc.nextInt();
        }

        for (int i = 0; i<alt;i++){
            if(i<alt-2){
                System.out.print("***     ***");
            }else{
                System.out.print("******  ******");
            }
            System.out.println("");
        }
    }
}
