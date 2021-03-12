package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Alumno a1 = new Alumno("Pedro","Gonzalez Díaz","11111111X","4ºA");
        Alumno a7 = new Alumno("Javier","Lleida Balón","11431515X","2ºA");
        Alumno a2 = new Alumno("Daniel","Alvedo Rios","22222222X","2ºA");
        Alumno a3 = new Alumno("Roberto","Hernandez Gomez","33333333X","2ºA");
        Alumno a4 = new Alumno("Julio","Moreno Lopez","44444444X","1ºA");
        Alumno a5 = new Alumno("María","Torres Alba","55555555X","1ºC");
        Alumno a6 = new Alumno("Juan","Domingo Salva","66666666X","3ºB");
        Alumno a8 = new Alumno("Lucía","Lopez García","12451234X","4ºA");
        Alumno a9 = new Alumno("Daniela","Índigo Fernandez","63736894X","1ºA");
        Alumno a10 = new Alumno("Julia","Blanco Castilla","41237257X","3ºB");

        Instituto i = new Instituto("I.E.S. Alixar");

        i.cargarAlumnos();


        i.addAlumnoUnidad("4ºA",a1);
        i.addAlumnoUnidad("2ºA",a7);
        i.addAlumnoUnidad("2ºA",a2);
        i.addAlumnoUnidad("2ºA",a3);
        i.addAlumnoUnidad("1ºA",a4);
        i.addAlumnoUnidad("1ºC",a5);
        i.addAlumnoUnidad("3ºB",a6);

        System.out.println("Mostrar todos los alumnos");
        i.mostrarTodosAlumnosOrdenados();

        System.out.println("Mostrar alumnos por Unidad(Ordenado por DNI)");
        i.mostrarAlumnosUnidad("2ºA");

        System.out.println("Mostrar en que unidad se encuentra el Alumno mediante el id");
        i.obtenerUnidadAlumno(7);


        i.guardarAlumnos();


    }
}
