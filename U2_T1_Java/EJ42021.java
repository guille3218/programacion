package com.company;

import java.util.Scanner;

public class EJ42021 {
    public static void main(String[] args) {
        /*
        Escribir un programa que incremente la hora de un reloj tantos segundos como le solicitemos mostrando cada vez la hora nueva.
Se solicitará al usuario por teclado las horas, los minutos y los segundos y el número de segundos que se quiere aumentar la hora.

Supondremos que el usuario siempre introduce valores correctos.
Ejemplo 1:

Introducza horas: 13
Introduzca minutos: 59
Introduzca segundos: 51
Introduzca segundos a incrementar: 10

Aumentando la hora...
13:59:52
13:59:53
13:59:54
13:59:55
13:59:56
13:59:57
13.59:58
13:59:59
14:00:00
14:00:01
         */
        Scanner sc = new Scanner(System.in);
        int h,m,s,ns;

        System.out.println("Introduzca horas");
        h=sc.nextInt();
        System.out.println("Introduzca minutos");
        m=sc.nextInt();
        System.out.println("Introduzca segundos");
        s=sc.nextInt();
        System.out.println("Introduzca segundos a incrementar");
        ns=sc.nextInt();

        System.out.println("Aumentando la hora...");

        for (int i =0; i<ns-1;i++){

            System.out.println(h+":"+m+":"+s++);
                if (s>59){
                    s=00;
                    System.out.println(h+":"+(m=m+1)+":"+s++);

                }else  if (m==59 && s==59){
                    System.out.println(h+":"+m+":"+s);
                    s=00;
                    m=00;
                    System.out.println((h=h+1)+":"+m+":"+s++);
                }

        }


    }
}
