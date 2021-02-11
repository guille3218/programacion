package com.company;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Deporte {
    protected String nombre;
    protected String pabellon;
    protected Participante[] participantes= new Participante[0];

    public Deporte(String nombre, String pabellon) {
        this.nombre = nombre;
        this.pabellon = pabellon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public void addParticipante(Participante p){
        Participante[] p1;

        p1= Arrays.copyOf(participantes,participantes.length+1);
        p1[p1.length-1]=p;

        participantes=p1;
    }

    public void deleteParticipante(Participante p){
        Participante[] p1 = new Participante[participantes.length-1];

        int j =0;

        for (int i = 0; i < participantes.length; i++) {
            if (!participantes[i].equals(p)){
                p1[j]=participantes[i];
                j++;
            }
        }

        participantes=p1;
    }

    public void mostrarParticipante(){
        Arrays.sort(participantes, new Comparator<Participante>() {
            @Override
            public int compare(Participante o1, Participante o2) {
                return o1.edad-o2.edad;
            }
        });

        System.out.println(Arrays.toString(participantes));
    }

}
