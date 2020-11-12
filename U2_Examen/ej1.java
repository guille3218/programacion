package com.company;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        /*
        Ejercicio 1:

Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los dígitos pares y
 los impares. Se van comprobando los dígitos de la siguiente manera: primer dígito del primer número, primer dígito del
  segundo número, segundo dígito del primer número, segundo dígito del segundo número, tercer dígito del primer número...
  Para facilitar el ejercicio, podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre
   habrá al menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir números largos.
         */
        Scanner sc = new Scanner(System.in);
        String n1,n2,np="",ni="";

        System.out.println("Por favor, introduzca un número:");
        n1= sc.nextLine();
        System.out.println("Introduzca otro número:");
        n2=sc.nextLine();

        for (int i = 0; i < n1.length(); i++) {
                if (n1.charAt(i)%2==0){
                    np=np+n1.charAt(i);
                }else{
                    ni=ni+n1.charAt(i);
                }
            if (n2.charAt(i)%2==0){
                np=np+n2.charAt(i);
            }else{
                ni=ni+n2.charAt(i);
            }
        }

        System.out.println("El numero formado por los dígitos pares es "+np);
        System.out.println("El numero formado por los dígitos impares es "+ni);
    }
}
