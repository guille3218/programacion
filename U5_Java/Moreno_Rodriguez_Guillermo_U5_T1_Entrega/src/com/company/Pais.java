package com.company;

public class Pais implements Comparable<Pais>{
    private String nombre;
    private int nparticipantes;

    public Pais(String nombre, int nparticipantes) {
        this.nombre = nombre;
        this.nparticipantes = nparticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNparticipantes() {
        return nparticipantes;
    }

    public void setNparticipantes(int nparticipantes) {
        this.nparticipantes = nparticipantes;
    }

    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareTo(o.getNombre());
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", nparticipantes=" + nparticipantes +
                '}';
    }
}
