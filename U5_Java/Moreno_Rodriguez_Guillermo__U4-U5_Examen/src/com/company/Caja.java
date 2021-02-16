package com.company;

import java.util.Arrays;

public class Caja {
    private int id;
    private Prenda[] prendas;

    public Caja(int id, Prenda[] prendas) {
        this.id = id;
        this.prendas = prendas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Prenda[] getPrendas() {
        return prendas;
    }

    public void setPrendas(Prenda[] prendas) {
        this.prendas = prendas;
    }

    public void addPrenda(Prenda p){
        if (prendas.length<5){
            Prenda[] p1 = Arrays.copyOf(prendas,prendas.length+1);
            p1[p1.length-1]=p;
            prendas=p1;
        }else{
            System.out.println("Lo siento, la caja está llena.");
        }
    }

    public void deletePrenda(Prenda p){
        Prenda[] p1 = new Prenda[prendas.length-1];

        int j =0;

        for (int i = 0; i < prendas.length; i++) {
            if (!p.equals(prendas[i])){
                p1[j]=prendas[i];
                j++;
            }
        }
        prendas=p1;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "id=" + id +
                ", prendas=" + Arrays.toString(prendas) +
                '}';
    }
}
