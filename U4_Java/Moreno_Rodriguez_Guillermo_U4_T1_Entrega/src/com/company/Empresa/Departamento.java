package com.company.Empresa;

import java.util.Arrays;

public class Departamento {
    private String nombreDepartamento;
    private String sede;
    private String extTelf;
    private Empleado[] listaEmpleados;
    private static int nDepartamentos=0;

    public Departamento(String nombreDepartamento, String sede, String extTelf, Empleado[] listaEmpleados) {
        this.nombreDepartamento = nombreDepartamento;
        this.sede = sede;
        this.extTelf = extTelf;
        this.listaEmpleados = listaEmpleados;
        nDepartamentos++;
    }

    public Departamento(String nombreDepartamento, String extTelf, Empleado[] listaEmpleados) {
        this.nombreDepartamento = nombreDepartamento;
        this.sede = "Castilleja";
        this.extTelf = extTelf;
        this.listaEmpleados = listaEmpleados;
        nDepartamentos++;
    }

    public Departamento(String nombreDepartamento, String sede, String extTelf) {
        this.nombreDepartamento = nombreDepartamento;
        this.sede = sede;
        this.extTelf = extTelf;
        this.listaEmpleados= new Empleado[0];
        nDepartamentos++;
    }

    public Departamento(String nombreDepartamento, String extTelf) {
        this.nombreDepartamento = nombreDepartamento;
        this.sede = "Castilleja";
        this.extTelf = extTelf;
        this.listaEmpleados = new Empleado[0];
        nDepartamentos++;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getExtTelf() {
        return extTelf;
    }

    public void setExtTelf(String extTelf) {
        this.extTelf = extTelf;
    }

    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Empleado[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public static int getnDepartamentos() {
        return nDepartamentos;
    }

    public void addEmpleado(Empleado e){
        listaEmpleados= Arrays.copyOf(listaEmpleados,listaEmpleados.length+1);
        listaEmpleados[listaEmpleados.length-1]=e;
    }

    public void deleteEmpleado(Empleado e){

        Empleado[] lista= new Empleado[0];

        for (int i = 0; i < listaEmpleados.length; i++) {
            if (listaEmpleados[i]!=e){
                lista=Arrays.copyOf(lista,lista.length+1);
                lista[lista.length-1]=listaEmpleados[i];
            }
        }
        listaEmpleados=lista;
    }

    public void mostrarListaEmpleados(){
        for(Empleado e : listaEmpleados){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombreDepartamento='" + nombreDepartamento + '\'' +
                ", sede='" + sede + '\'' +
                ", extTelf='" + extTelf + '\'' +
                ", listaEmpleados=" + Arrays.toString(listaEmpleados) +
                '}';
    }
}
