package com.company;

import java.io.*;
import java.util.*;

public class Instituto {
    private String nombre;
    private Map<String, TreeSet<Alumno>> Unidad = new TreeMap<>();

    public Instituto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, TreeSet<Alumno>> getUnidad() {
        return Unidad;
    }

    public void setUnidad(Map<String, TreeSet<Alumno>> unidad) {
        Unidad = unidad;
    }

    public void addAlumnoUnidad(String unidad, Alumno alumno){
        if (!Unidad.containsKey(unidad)){
            Unidad.put(unidad,new TreeSet<>());
        }
        Unidad.get(unidad).add(alumno);
    }

    public void mostrarTodosAlumnosOrdenados(){
        System.out.println(Unidad.values());

    }

    public void mostrarAlumnosUnidad(String unidad){
        if (!Unidad.containsKey(unidad)){
            System.out.println("Lo siento, esa unidad no existe");
        }else{
            System.out.println(Unidad.get(unidad));
        }
    }

    public void obtenerUnidadAlumno(int id){
        Set<String> keys = Unidad.keySet();
        for (String k : keys){
            TreeSet<Alumno> alumnos = Unidad.get(k);
            for (Alumno a :alumnos){
                if (a.getId()==id){
                    System.out.println("El alumno se encuentra en la unidad: "+k);
                }
            }
        }
    }


    public void guardarAlumnos(){
        Set<String> keys = Unidad.keySet();
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));


            for (String k : keys){
                TreeSet<Alumno> alumnos = Unidad.get(k);
                for (Alumno a :alumnos){
                    out.writeObject(a);
                }
            }

            out.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void cargarAlumnos(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("alumnos.dat"));

            while (true){
                Alumno a =(Alumno) in.readObject();
                addAlumnoUnidad(a.getUnidad(),a);
            }


        }catch(IOException | ClassNotFoundException e){
            System.out.println("");
        }
    }
    @Override
    public String toString() {
        return "Instituto{" +
                "nombre='" + nombre + '\'' +
                ", Unidad=" + Unidad +
                '}';
    }
}
