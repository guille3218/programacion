package com.company;

public abstract class Vehiculo {
    protected String matricula;
    protected int cargamax;
    protected Conductor conductor;

    public Vehiculo(String matricula, int cargamax, Conductor conductor) {
        this.matricula = matricula;
        this.cargamax = cargamax;
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCargamax() {
        return cargamax;
    }

    public void setCargamax(int cargamax) {
        this.cargamax = cargamax;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public abstract void descargar();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", cargamax=" + cargamax +
                ", conductor=" + conductor +
                '}';
    }
}
