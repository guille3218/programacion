package U2_Examen;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        /*
        Ejercicio 4:

Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:


• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), los días que ha estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.
         */
        Scanner sc = new Scanner(System.in);
        int cargo,dias,estado,sueldo;
        double IRPF;
        sueldo=0;
        IRPF=0;

        System.out.println("Indica tu cargo(selecciona indicando el número):");
        System.out.println("1-Prog. junior");
        System.out.println("2-Prog. senior");
        System.out.println("3-Jefe de proyecto");
        cargo=sc.nextInt();

            switch (cargo){
                case 1:
                    sueldo=950;
                    break;
                case 2:
                    sueldo=1200;
                    break;
                case 3:
                    sueldo=1600;
                    break;
            }

        System.out.println("Introduce los días que has estado de viaje visitando clientes:");
        dias=sc.nextInt();

        System.out.println("Indica tu estado civil(selecciona indicando el número):");
        System.out.println("1-Soltero");
        System.out.println("2-Casado");
        estado=sc.nextInt();

        switch (estado) {
            case 1:
                IRPF = 0.25;
                break;
            case 2:
                IRPF= 0.20;
                break;
        }

        double sueldobruto=sueldo+dias*30;
        double retencion=sueldobruto*IRPF;
        System.out.println("------------------------------------------");
        System.out.println("| Sueldo Base                     "+(double)sueldo+" |");
        System.out.println("| Dietas ("+dias+" dias de viajes)"+"        "+(double)(dias*30)+" |" );
        System.out.println("|----------------------------------------|");
        System.out.println("| Sueldo Bruto                    "+sueldobruto+" |");
        System.out.println("| Retención IRPF ("+(IRPF*100)+"%)"+"           "+retencion+" |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Sueldo neto                     "+(sueldobruto-retencion)+" |");
        System.out.println("------------------------------------------");
    }
}
