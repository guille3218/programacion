package com.company;

public class PrendaColgada extends Prenda implements Colgar{

    private double altura;

    public PrendaColgada(String nombre,double precio, String codigobarras, double peso, double altura) {
        super(nombre,precio, codigobarras, peso);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "PrendaColgada{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigobarras='" + codigobarras + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    @Override
    public void doblar() {
        System.out.println("La prenda "+this.getNombre()+" no se puede doblar");
    }

    @Override
    public void colgar() {
        System.out.println("La prenda "+this.getNombre()+" está colgada");
    }
}
