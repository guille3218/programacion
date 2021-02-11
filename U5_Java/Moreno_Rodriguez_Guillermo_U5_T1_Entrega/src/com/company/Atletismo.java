package com.company;

import java.util.Arrays;

public class Atletismo extends Deporte{
    private int npruebas;

    public Atletismo(String nombre, String pabellon, int npruebas) {
        super(nombre, pabellon);
        this.npruebas = npruebas;
    }

    public int getNpruebas() {
        return npruebas;
    }

    public void setNpruebas(int npruebas) {
        this.npruebas = npruebas;
    }

    @Override
    public String toString() {
        return "Atletismo{" +
                "npruebas=" + npruebas +
                ", nombre='" + nombre + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
