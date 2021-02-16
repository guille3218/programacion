package com.company;

import java.util.Arrays;

public class CamionPercha extends Vehiculo implements Comparable<CamionPercha>{

    private PrendaColgada[] prendascolgadas;

    public CamionPercha(String matricula, int cargamax, Conductor conductor, PrendaColgada[] prendascolgadas) {
        super(matricula, cargamax, conductor);
        this.prendascolgadas = prendascolgadas;
    }

    public PrendaColgada[] getPrendascolgadas() {
        return prendascolgadas;
    }

    public void setPrendascolgadas(PrendaColgada[] prendascolgadas) {
        this.prendascolgadas = prendascolgadas;
    }

    public void addPrendaColgada(PrendaColgada p){
        PrendaColgada[] p1 = Arrays.copyOf(prendascolgadas,prendascolgadas.length+1);
        p1[p1.length-1]=p;
        prendascolgadas=p1;
    }

    public void deletePrendaColgada(PrendaColgada p){
        PrendaColgada[] p1 = new PrendaColgada[prendascolgadas.length-1];

        int j = 0;

        for (int i = 0; i < prendascolgadas.length; i++) {
            if (!p.equals(prendascolgadas[i])){
                p1[j]=prendascolgadas[i];
                j++;
            }
        }

        prendascolgadas=p1;
    }

    @Override
    public void descargar() {
        System.out.println("Se han descargado "+prendascolgadas.length+" prendas.");
    }

    @Override
    public int compareTo(CamionPercha o) {
        return this.getPrendascolgadas().length-o.getPrendascolgadas().length;
    }

    @Override
    public String toString() {
        return "CamionPercha{" +
                "prendascolgadas=" + Arrays.toString(prendascolgadas) +
                ", matricula='" + matricula + '\'' +
                ", cargamax=" + cargamax +
                ", conductor=" + conductor +
                '}';
    }
}
