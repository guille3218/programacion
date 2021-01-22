package com.company.Empresa;

import java.util.Calendar;

public class Empleado {
    private String FullName;
    private String NSS;
    private String telf;
    private Calendar fechaEntrada;
    private TipoEmpleado tipo;
    private static int nEmpleados=0;



    public Empleado(String fullName, String NSS, String telf, Calendar fechaEntrada, TipoEmpleado tipo) {
        FullName = fullName;
        this.NSS = NSS;
        this.telf = telf;
        this.fechaEntrada = fechaEntrada;
        this.tipo = tipo;
        nEmpleados++;
    }

    public Empleado(String fullName, String NSS, String telf, Calendar fechaEntrada) {
        FullName = fullName;
        this.NSS = NSS;
        this.telf = telf;
        this.fechaEntrada = fechaEntrada;
        this.tipo= TipoEmpleado.TECNICO;
        nEmpleados++;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public Calendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Calendar fecha_entrada) {
        this.fechaEntrada = fecha_entrada;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public static int getnEmpleados() {
        return nEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "FullName='" + FullName + '\'' +
                ", NSS='" + NSS + '\'' +
                ", telf='" + telf + '\'' +
                ", fechaEntrada=" + Integer.toString(fechaEntrada.get(Calendar.DATE)) + "/" + Integer.toString(fechaEntrada.get(Calendar.MONTH)+1) + "/" + Integer.toString(fechaEntrada.get(Calendar.YEAR)) +
                ", tipo=" + tipo +
                '}';
    }
}
