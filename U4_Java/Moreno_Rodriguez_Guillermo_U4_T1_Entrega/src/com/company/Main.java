package com.company;


import com.company.Empresa.Departamento;
import com.company.Empresa.Empleado;
import com.company.Empresa.Empresa;
import com.company.Empresa.TipoEmpleado;

import java.sql.SQLOutput;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Empleado e1 = new Empleado("Luis Alvarez Ordeño", "XXXXXXXX","156246514", Calendar.getInstance(), TipoEmpleado.ADMINISTRATIVO);
        Empleado e2 = new Empleado("Jose Perez Lopez", "XXXXXXXX","425638954", Calendar.getInstance());
        Empleado e3 = new Empleado("Pedro Ruiz Moreno", "XXXXXXXX","328945216", Calendar.getInstance(), TipoEmpleado.ADMINISTRATIVO);
        Empleado e4 = new Empleado("Daniel Gonzalez Jimenez", "XXXXXXXX","264358741", Calendar.getInstance(), TipoEmpleado.DIRECTIVO);
        Empleado e5 = new Empleado("David Murillo Diaz", "XXXXXXXX","326789554", Calendar.getInstance());
        Empleado e6 = new Empleado("Alejandro Rojo Mira", "XXXXXXXX","225426632", Calendar.getInstance(), TipoEmpleado.TECNICO);

        Departamento d1 = new Departamento("Departamento01","Bormujos","468454522");
        Departamento d2 = new Departamento("Departamento02","7475465");
        Departamento d3= new Departamento("Departamento03","Sevilla","765465465");

        Empresa empresa = new Empresa("TechnoShop");

        System.out.println("--------------------Departamentos de la Empresa--------------------");
        empresa.addDepartamento(d1);
        empresa.addDepartamento(d2);
        empresa.addDepartamento(d3);
        empresa.mostrarListaDepartamentos();
        System.out.println();

        System.out.println("--------------------Empleados Departamento 1--------------------");
        d1.addEmpleado(e1);
        d1.addEmpleado(e2);
        d1.mostrarListaEmpleados();
        System.out.println();

        System.out.println("--------------------Empleados Departamento 2--------------------");
        d2.addEmpleado(e3);
        d2.addEmpleado(e4);
        d2.mostrarListaEmpleados();
        System.out.println();

        System.out.println("--------------------Empleados Departamento 3--------------------");
        d3.addEmpleado(e5);
        d3.addEmpleado(e6);
        d3.mostrarListaEmpleados();
        System.out.println();

        System.out.println("--------------------Empleados Departamento 2 despues de eliminar--------------------");
        d2.deleteEmpleado(e3);
        d2.mostrarListaEmpleados();
        System.out.println();

        System.out.println("--------------------Departamentos de la Empresa junto empleados--------------------");
        empresa.mostrarListaDepartamentos();
        System.out.println();

        System.out.printf("Numero de empleados creados= ");
        System.out.println(Empleado.getnEmpleados());
        System.out.println();

        System.out.printf("Numero de departamentos creados= ");
        System.out.println(Departamento.getnDepartamentos());

    }
}
