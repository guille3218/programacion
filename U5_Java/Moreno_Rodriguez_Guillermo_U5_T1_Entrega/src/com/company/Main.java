package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Atleta p1 = new Atleta("Pedro",14,"500M Liso");
        Atleta p2 = new Atleta("Manuel",16,"500M liso");
        BasketPlayer p3 = new BasketPlayer("Juan",34,1.98);
        BasketPlayer p4 = new BasketPlayer("Daniel", 36,2.10);
        Judoka p5 = new Judoka("Mario",23,34);
        Judoka p6 = new Judoka("Takeshi",21,42);

        Atletismo d1 = new Atletismo("Taiwan","asda",4);
        Baloncesto d2 = new Baloncesto("California","Gasda",5);
        Judo d3 = new Judo("Japon","Teras",7);

        Pais c1 = new Pais("España",2);
        Pais c2 = new Pais("Japon",1);
        Pais c3 = new Pais("Francia",3);

        Juego j1 = new Juego(2004,"Alemania");

        System.out.println("Juramentos");
        System.out.println("----------");

        p1.hacerJuramento();
        p2.hacerJuramento();
        p3.hacerJuramento();
        p4.hacerJuramento();
        p5.hacerJuramento();
        p6.hacerJuramento();

        System.out.println("------");
        System.out.println("Frases");
        System.out.println("------");
        p1.correr();
        p2.correr();
        p3.encestar();
        p4.encestar();
        p5.luchar();
        p6.luchar();

        System.out.println("------------");

        d1.addParticipante(p1);
        d1.addParticipante(p2);

        d2.addParticipante(p3);
        d2.addParticipante(p4);

        d3.addParticipante(p5);
        d3.addParticipante(p6);

        System.out.println("Antes de eliminar participante");
        d1.mostrarParticipante();

        System.out.println("Despues de eliminar participante");
        d1.deleteParticipante(p1);
        d1.mostrarParticipante();

        j1.addDeporte(d1);
        j1.addDeporte(d2);
        j1.addDeporte(d3);

        j1.addPais(c1);
        j1.addPais(c2);
        j1.addPais(c3);

        System.out.println(j1);

        System.out.println("Mostrar paises por numeros participante");
        j1.mostrarPaises();

        System.out.println("Mostrar paises por defecto");
        j1.mostrarPaisesParaCeremonia();


        System.out.println("Juego despues de eliminar 1 pais y 1 deporte");

        j1.deleteDeporte(d2);
        j1.deletePais(c1);

        System.out.println(j1);


        System.out.println("Jugadores ordenados por edad");

        //Añadido otros participantes a d3 para que haya mas que ordenar
        d3.addParticipante(p1);
        d3.addParticipante(p2);
        d3.addParticipante(p3);
        d3.addParticipante(p4);

        d3.mostrarParticipante();




    }
}
