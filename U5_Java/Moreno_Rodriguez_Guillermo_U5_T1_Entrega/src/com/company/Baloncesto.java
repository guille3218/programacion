package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Baloncesto extends Deporte {
    private int nequipos;

    public Baloncesto(String nombre, String pabellon, int nequipos) {
        super(nombre, pabellon);
        this.nequipos = nequipos;
    }

    public int getNequipos() {
        return nequipos;
    }

    public void setNequipos(int nequipos) {
        this.nequipos = nequipos;
    }

/*    public void mostrarJugadoresBaloncestoPorAltura(){
        Arrays.sort(participantes, new Comparator<BasketPlayer>() {
            @Override
            public int compare(BasketPlayer o1, BasketPlayer o2) {
                if( o1.getAltura()-o2.getAltura()>0){
                    return 1;
                }else if(o1.getAltura()-o2.getAltura()<0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
    }*/

    @Override
    public String toString() {
        return "Baloncesto{" +
                "nequipos=" + nequipos +
                ", nombre='" + nombre + '\'' +
                ", pabellon='" + pabellon + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
