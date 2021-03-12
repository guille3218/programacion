package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Alumno implements Comparable<Alumno>, Serializable {
    private String nombre;
    private String apellidos;
    private String dni;
    private int id;
    private static int id_Increment=1;
    private String unidad;

    public Alumno(String nombre, String apellidos, String dni, String unidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.unidad = unidad;
        this.id=id_Increment;
        id_Increment++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getId_Increment() {
        return id_Increment;
    }

    public static void setId_Increment(int id_Increment) {
        Alumno.id_Increment = id_Increment;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return apellidos.equals(alumno.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", unidad='" + unidad + '\'' +
                ", id="+ id + '\''+
                '}';
    }

    @Override
    public int compareTo(Alumno o) {
        return this.dni.compareTo(o.dni);
    }
}
