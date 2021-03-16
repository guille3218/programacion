package com.company;

import java.io.*;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String opcion;
        Maraton m1= new Maraton();
        String nombre;
        String pais;
        String categoria;
        Categorias c1;
        Integer dorsal;
        Integer segundos;

        Atleta a2 = new Atleta("Daniel","España",Categorias.JUNIOR);
        Atleta a3 = new Atleta("Juan","España",Categorias.JUNIOR);
        Atleta a4 = new Atleta("Pedro","Italia",Categorias.JUNIOR);
        Atleta a5 = new Atleta("David","Italia",Categorias.JUNIOR);
        Atleta a6 = new Atleta("Alba","España",Categorias.JUNIOR);
        Atleta a7 = new Atleta("Joel","Portugal",Categorias.SENIOR);
        Atleta a8 = new Atleta("María","Portugal",Categorias.SENIOR);
        Atleta a9 = new Atleta("Lucía","España",Categorias.SENIOR);
        Atleta a10 = new Atleta("Lola","España",Categorias.SENIOR);
        Atleta a11 = new Atleta("Roberto","España",Categorias.SENIOR);
        Atleta a12 = new Atleta("Lorenzo","Italia",Categorias.VETERANO);
        Atleta a13 = new Atleta("Luis","Italia",Categorias.VETERANO);
        Atleta a14 = new Atleta("Hugo","España",Categorias.VETERANO);
        Atleta a15 = new Atleta("Sara","España",Categorias.VETERANO);
        Atleta a16 = new Atleta("Antonio","España",Categorias.VETERANO);

        m1.inscribirAtleta(a2);
        m1.inscribirAtleta(a3);
        m1.inscribirAtleta(a4);
        m1.inscribirAtleta(a5);
        m1.inscribirAtleta(a6);
        m1.inscribirAtleta(a7);
        m1.inscribirAtleta(a8);
        m1.inscribirAtleta(a9);
        m1.inscribirAtleta(a10);
        m1.inscribirAtleta(a11);
        m1.inscribirAtleta(a12);
        m1.inscribirAtleta(a13);
        m1.inscribirAtleta(a14);
        m1.inscribirAtleta(a15);
        m1.inscribirAtleta(a16);

        m1.guardarTiempo(1,130);
        m1.guardarTiempo(3,350);
        m1.guardarTiempo(5,453);
        m1.guardarTiempo(7,120);
        m1.guardarTiempo(9,90);
        m1.guardarTiempo(11,230);
        m1.guardarTiempo(13,230);
        m1.guardarTiempo(15,140);
        m1.guardarTiempo(6,320);
        m1.guardarTiempo(8,420);

        System.out.println("Bienvenido al programa del maratón de Castilleja de la Cuesta.");

        do {

            mostrarMenu();
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                     try {
                         ObjectInputStream in = new ObjectInputStream(new FileInputStream("maraton.dat"));
                         while (true){
                             m1.inscribirAtleta((Atleta) in.readObject());
                         }
                     }catch (IOException | ClassNotFoundException e){
                         System.out.println("Se ha finalizado correctamente");
                     }
                    break;
                case "2":
                    try {
                        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("maraton.dat"));
                        Collection<Atleta> atletas = m1.getAtletas().values();

                        for (Atleta a:atletas) {
                            out.writeObject(a);
                        }

                        out.close();

                    }catch (IOException e){
                        e.getMessage();
                    }
                    break;
                case "3":

                    System.out.println("Introduce el nombre del atleta:");
                    nombre = sc.nextLine();
                    System.out.println("Introduce el país:");
                    pais= sc.nextLine();
                    menuCategorias();
                    categoria = sc.nextLine();

                    if (categoria.equals("1")) {
                        c1 = Categorias.SENIOR;
                    } else if (categoria.equals("2")) {
                        c1 = Categorias.JUNIOR;
                    } else {
                        c1 = Categorias.VETERANO;
                    }

                    Atleta a1 = new Atleta(nombre, pais, c1);

                    m1.inscribirAtleta(a1);

                    break;
                case "4":

                    System.out.println("Introduce el dorsal:");
                    dorsal=sc.nextInt();
                    System.out.println("Introduce los segundos:");
                    segundos=sc.nextInt();
                    sc.nextLine();

                    m1.guardarTiempo(dorsal,segundos);

                    break;
                case "5":

                    System.out.println("Introduce el dorsal:");
                    dorsal=sc.nextInt();
                    sc.nextLine();

                    m1.deleteAtleta(dorsal);
                    break;
                case "6":
                        m1.mostrarListaFinishers();
                    break;
                case "7":
                        menuCategorias();
                        categoria=sc.nextLine();
                    if (categoria.equals("1")) {
                        c1 = Categorias.SENIOR;
                    } else if (categoria.equals("2")) {
                        c1 = Categorias.JUNIOR;
                    } else {
                        c1 = Categorias.VETERANO;
                    }
                        m1.mostrarListaCategorias(c1);
                    break;
                case "8":
                    System.out.println("Introduce el país:");
                    pais=sc.nextLine();

                    m1.participantesPorPais(pais);
                    break;
                case "9":
                    m1.mostrarAtletas();
                    break;
                case "10":
                    m1.deleteAll();
                    break;
                case "11":
                    System.out.println("Fin del programa.");
                    break;
            }
        }while (!opcion.equals("11"));
    }

    public static void mostrarMenu(){

        System.out.println("¿Qué quiere hacer?");
        System.out.println("1.- Cargar atletas.");
        System.out.println("2.- Guardar atletas.");
        System.out.println("3.- Inscribir atleta.");
        System.out.println("4.- Guardar tiempo.");
        System.out.println("5.- Borrar atleta.");
        System.out.println("6.- Mostrar lista de atletas acabados ordenado por tiempo.");
        System.out.println("7.- Mostrar lista de atletas de una categoría.");
        System.out.println("8.- Participantes de un país.");
        System.out.println("9.- Mostrar todos los atletas(Ordenados por dorsal).");
        System.out.println("10.- Eliminar todos los atletas");
        System.out.println("11.- Salir");
    }

    public static void  menuCategorias(){
        System.out.println("Seleccione categoría:");
        System.out.println("1.- Senior");
        System.out.println("2.- Junior");
        System.out.println("3.- Veterano");
    }
}
