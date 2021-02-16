package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Prenda p1 = new Prenda("Camiseta",13.4,"X61346125",43.4);
        Prenda p2 = new Prenda("Tirantas",42.2,"X62341253",12.3);
        Prenda p3 = new Prenda("Bañador",9.99,"X54234124",54.6);
        Prenda p4 = new Prenda("Traje",52.3,"X41232145",21.1);
        Prenda p5 = new Prenda("Pantalones",32.3,"X42134123",5.3);
        Prenda p6 = new Prenda("Jersey",35.3,"X42523426",12.4);
        Prenda p7 = new Prenda("Sudadera",42.3,"X64245234",14.3);
        Prenda p8 = new Prenda("Vestido",132.3,"X53243256",61.3);
        PrendaColgada pc1 = new PrendaColgada("Vestido",42.3,"X52342523",52.4,1.4);
        PrendaColgada pc2 = new PrendaColgada("Traje",87.3,"X52342523",12.5,2.0);
        PrendaColgada pc3 = new PrendaColgada("Vestido",26.3,"X52342523",63.4,1.9);
        PrendaColgada pc4 = new PrendaColgada("Vestido",23.3,"X52342523",54.23,1.7);
        PrendaColgada pc5 = new PrendaColgada("Traje",42.3,"X52342523",23.6,1.7);
        PrendaColgada pc6 = new PrendaColgada("Kimono",63.3,"X52342523",45.12,2.0);
        Prenda[] prendas1={p1,p2};
        Prenda[] prendas2 ={p3};
        Prenda[] prendas3={p6,p7};
        Caja c1 = new Caja(431,prendas1);
        Caja c2 = new Caja(123,prendas2);
        Caja c3 = new Caja(412,prendas3);
        Conductor d1 = new Conductor("Pedro","García Lopez","XXXXXXXXX");
        Conductor d2 = new Conductor("Daniel","Gonzalez Gomez","NNNNNNNNN");

        //Operaciones con cajas

        System.out.println("Caja sin prendas añadidas");
        System.out.println(c2);

        System.out.println("Caja con prendas añadidas");
        c2.addPrenda(p4);
        c2.addPrenda(p5);
        c3.addPrenda(p8);
        System.out.println(c2);

        System.out.println("Caja eliminando 1 prenda");
        c2.deletePrenda(p4);
        System.out.println(c2);

        System.out.println("Introducir mas de 5 prendas");
        c2.addPrenda(p4);
        c2.addPrenda(p1);
        c2.addPrenda(p2);
        c2.addPrenda(p6);
        c2.addPrenda(p7);

        //Operaciones con Camion Caja

        Caja[] cajas1=new Caja[0];
        Caja[] cajas2 = new Caja[0];

        CamionCaja b1= new CamionCaja("XXX4314",54,d1,cajas1);
        CamionCaja b2 = new CamionCaja("LLL5134",62,d2,cajas2);

        b1.addCaja(c1);
        b1.addCaja(c2);
        b2.addCaja(c3);
        CamionCaja[] camionescajas={b1,b2};

        System.out.println("Camiones cajas sin ordenar");
        System.out.println(Arrays.toString(camionescajas));

        System.out.println("Camiones cajas ordenados por numero de cajas");
        Arrays.sort(camionescajas);
        System.out.println(Arrays.toString(camionescajas));

        System.out.println("Camiones cajas ordenados por peso");
        Arrays.sort(camionescajas, new Comparator<CamionCaja>() {
            @Override
            public int compare(CamionCaja o1, CamionCaja o2) {
                return  o1.getCargamax()-o2.getCargamax();
            }
        });

        System.out.println(Arrays.toString(camionescajas));

        b1.descargar();

        //Operaciones con Camiones Perchas

        PrendaColgada[] prendascolgadas1 = new PrendaColgada[0];
        PrendaColgada[] prendascolgadas2 = new PrendaColgada[0];

        CamionPercha cp1 = new CamionPercha("GGG4321",45,d1,prendascolgadas1);
        CamionPercha cp2 = new CamionPercha("TTT5124",64,d2,prendascolgadas2);

        cp1.addPrendaColgada(pc1);
        cp1.addPrendaColgada(pc2);
        cp1.addPrendaColgada(pc3);
        cp1.addPrendaColgada(pc4);
        cp2.addPrendaColgada(pc5);
        cp2.addPrendaColgada(pc6);

        CamionPercha[] camionesperchas={cp1,cp2};
        System.out.println("Camiones perchas sin ordenar");
        System.out.println(Arrays.toString(camionesperchas));

        System.out.println("Camiones perchas ordenados");
        Arrays.sort(camionesperchas, new Comparator<CamionPercha>() {
            @Override
            public int compare(CamionPercha o1, CamionPercha o2) {
                return o1.getPrendascolgadas().length-o2.getPrendascolgadas().length;
            }
        });

        System.out.println(Arrays.toString(camionesperchas));

        cp1.descargar();

        //Operaciones con Prendas

        p1.devolver();
        pc1.devolver();

        p1.doblar();
        pc1.doblar();

        pc1.colgar();

        System.out.println("Prendas en el sistema");
        System.out.println(Prenda.getNprenda());

    }
}
