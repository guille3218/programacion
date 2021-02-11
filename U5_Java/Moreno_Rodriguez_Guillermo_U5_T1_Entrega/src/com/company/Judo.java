package com.company;

import java.util.Arrays;

public class Judo extends Deporte{
    private int ntatamis;

    public Judo(String nombre, String pabellon, int ntatamis) {
        super(nombre, pabellon);
        this.ntatamis = ntatamis;
    }

    public int getNtatamis() {
        return ntatamis;
    }

    public void setNtatamis(int ntatamis) {
        this.ntatamis = ntatamis;
    }

    @Override
    public String toString() {
        return "Judo{" +
                "nombre='" + nombre + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                ", ntatamis=" + ntatamis +
                '}';
    }
}
