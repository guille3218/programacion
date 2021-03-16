package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Atleta implements Comparable<Atleta>, Serializable {
    private Integer dorsal;
    private String nombre;
    private String pais;
    private int marcaSegundos;
    private Categorias categoria;
    private boolean finisher;
    private static Integer nextDorsal=1;

    public Atleta(String nombre, String pais, Categorias categoria) {
        this.dorsal=nextDorsal;
        this.nombre = nombre;
        this.pais = pais;
        this.marcaSegundos=0;
        this.categoria = categoria;
        this.finisher = false;

        nextDorsal++;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMarcaSegundos() {
        return marcaSegundos;
    }

    public void setMarcaSegundos(int marcaSegundos) {
        this.marcaSegundos = marcaSegundos;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public static int getNextDorsal() {
        return nextDorsal;
    }

    public static void setNextDorsal(int nextDorsal) {
        Atleta.nextDorsal = nextDorsal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return marcaSegundos == atleta.marcaSegundos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marcaSegundos);
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", marcaSegundos=" + marcaSegundos +
                ", categoria=" + categoria +
                ", finisher=" + finisher +
                '}';
    }

    @Override
    public int compareTo(Atleta o) {
        return marcaSegundos-o.getMarcaSegundos();
    }
}
