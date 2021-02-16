package com.company;

import java.util.Arrays;

public class CamionCaja extends Vehiculo implements Comparable<CamionCaja>{

    private Caja[] cajas;

    public CamionCaja(String matricula, int cargamax, Conductor conductor, Caja[] cajas) {
        super(matricula, cargamax, conductor);
        this.cajas = cajas;
    }

    public Caja[] getCajas() {
        return cajas;
    }

    public void setCajas(Caja[] cajas) {
        this.cajas = cajas;
    }

    public void addCaja(Caja c){
        Caja[] c1= Arrays.copyOf(cajas,cajas.length+1);
        c1[c1.length-1]=c;
        cajas=c1;
    }

    public void deleteCaja(Caja c){
        Caja[] c1 = new Caja[cajas.length-1];

        int j =0;

        for (int i = 0; i < cajas.length; i++) {
            if (!c.equals(cajas[i])){
                c1[j]=cajas[i];
                j++;
            }
        }
        cajas=c1;
    }

    @Override
    public void descargar() {
        int nprendas=0;
        for (int i = 0; i < cajas.length; i++) {
            for (int j = 0; j < cajas[i].getPrendas().length; j++) {
                nprendas++;
            }
        }
        System.out.println("Descargando "+cajas.length+" Cajas y "+nprendas+" prendas.");
    }

    @Override
    public int compareTo(CamionCaja o) {
        return this.cajas.length-o.getCajas().length;
    }

    @Override
    public String toString() {
        return "CamionCaja{" +
                "cajas=" + Arrays.toString(cajas) +
                ", matricula='" + matricula + '\'' +
                ", cargamax=" + cargamax +
                ", conductor=" + conductor +
                '}';
    }
}
