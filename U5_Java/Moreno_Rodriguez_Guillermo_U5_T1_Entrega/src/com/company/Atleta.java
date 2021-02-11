package com.company;

public class Atleta extends Participante implements Correr{
    private String prueba;

    public Atleta(String nombre, int edad, String prueba) {
        super(nombre, edad);
        this.prueba = prueba;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+getNombre()+", como atleta, juro los valores deportivos mundiales");
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "prueba='" + prueba + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
