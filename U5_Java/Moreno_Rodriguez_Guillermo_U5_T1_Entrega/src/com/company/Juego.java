package com.company;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Juego {
    private int year;
    private String sede;
    private Pais[] paises = new Pais[0];
    private Deporte[] deportes = new Deporte[0];

    public Juego(int year, String sede) {
        Calendar fecha = new GregorianCalendar();
        int currentYear = fecha.get(Calendar.YEAR);
        if (year%4==0){
            this.year = year;
        }else if (currentYear%4==0){
            this.year=currentYear;
        }else{
            this.year=2000;
        }
        this.sede = sede;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises() {
        return paises;
    }

    public void setPaises(Pais[] paises) {
        this.paises = paises;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }

    public void addPais(Pais p){
        Pais[] p1;

        p1= Arrays.copyOf(paises,paises.length+1);
        p1[p1.length-1]=p;

        paises=p1;
    }

    public void deletePais(Pais p){
        Pais[] p1 = new Pais[paises.length-1];

        int j=0;

        for (int i = 0; i < paises.length; i++) {
            if (!paises[i].equals(p)){
                p1[j]=paises[i];
                j++;
            }
        }

        paises=p1;

    }

    public void addDeporte(Deporte d){
        Deporte[] d1;

        d1=Arrays.copyOf(deportes,deportes.length+1);
        d1[d1.length-1]=d;

        deportes=d1;
    }

    public void deleteDeporte(Deporte d){
        Deporte[] d1 = new Deporte[deportes.length-1];

        int j=0;

        for (int i = 0; i < deportes.length; i++) {
            if (!deportes[i].equals(d)){
                d1[j]=deportes[i];
                j++;
            }
        }

        deportes=d1;
    }

    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(paises);
        System.out.println(Arrays.toString(paises));
    }

    public void mostrarPaises(){
        Arrays.sort(paises, new Comparator<Pais>() {
            @Override
            public int compare(Pais o1, Pais o2) {
                return o2.getNparticipantes()-o1.getNparticipantes();
            }
        });

        System.out.println(Arrays.toString(paises));
    }

    @Override
    public String toString() {
        return "Juego{" +
                "year=" + year +
                ", sede='" + sede + '\'' +
                ", paises=" + Arrays.toString(paises) +
                ", deportes=" + Arrays.toString(deportes) +
                '}';
    }
}
