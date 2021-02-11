package com.company;

public class Judoka extends Participante implements Lucha{
    private int peso;

    public Judoka(String nombre, int edad, int peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+getNombre()+", como judoka, juro los valores deportivos mundiales");
    }

    @Override
    public String toString() {
        return "Judoka{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
