package com.company;

import java.util.Scanner;

public class EJ22021 {
    public static void main(String[] args) {
        /*
        Ejercicio 2:
Realizar un programa que dado un número que se solicita la usuario por consola eliminará de ese número de ese número
todos los 0 y todos los 8 indicando adicionalmente cuántos números ha eliminado.Deberá solicitar el número mientras que
el número introducido no sea positivo.

Ejemplo 1:
Introduzca un número entero positivo: 34084091
Número resultado: 34491
Dígitos eliminados: 3

Ejemplo 2:
Introduzca un número entero positivo: 84123
Número resultado: 4123
Dígitos eliminados: 1
NOTA: NO SE PUEDEN UTILIZAR FUNCIONES DE CADENAS
         */
        Scanner sc = new Scanner(System.in);
        int num,x=0,c=0;

        System.out.println("Introduce un número positivo");
        num=sc.nextInt();

       while (num<0){
            System.out.println("El número introducido es negativo, por favor introduzca un número positivo.");
            num=sc.nextInt();
       }

       while(num>0) {
           c = num % 10;
           if(c!=0||c!=8){
               x = x * 10 + num % 10;
               num = (num - num % 10);
           }
       }

       System.out.println(x);

    }
}
