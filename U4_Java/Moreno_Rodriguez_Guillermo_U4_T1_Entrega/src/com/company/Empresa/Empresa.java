package com.company.Empresa;

import java.util.Arrays;

public class Empresa {
    private String nombre;
    private Departamento[] listaDepartamentos;

    public Empresa(String nombre, Departamento[] listaDepartamentos) {
        this.nombre = nombre;
        this.listaDepartamentos = listaDepartamentos;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaDepartamentos= new Departamento[0];
    }

    public void addDepartamento(Departamento d){
        listaDepartamentos= Arrays.copyOf(listaDepartamentos,listaDepartamentos.length+1);
        listaDepartamentos[listaDepartamentos.length-1]=d;
    }

    public void mostrarListaDepartamentos(){
        for(Departamento d : listaDepartamentos){
            System.out.println(d);
        }
    }


}
