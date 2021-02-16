package com.company;

public class Prenda implements Devolver , Doblar{
    protected String nombre;
    protected double precio;
    protected String codigobarras;
    protected double peso;
    private static int nprenda=0;

    public Prenda(String nombre, double precio, String codigobarras, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigobarras = codigobarras;
        this.peso = peso;
        nprenda++;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigobarras() {
        return codigobarras;
    }

    public void setCodigobarras(String codigobarras) {
        this.codigobarras = codigobarras;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static int getNprenda() {
        return nprenda;
    }

    public static void setNprenda(int nprenda) {
        Prenda.nprenda = nprenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigobarras='" + codigobarras + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo la prenda con nombre " +this.getNombre()+" y precio "+this.getPrecio());
    }

    @Override
    public void doblar() {
        System.out.println("La prenda "+this.getNombre()+" se puede doblar");
    }
}
