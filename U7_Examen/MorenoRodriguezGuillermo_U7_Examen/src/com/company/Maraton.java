package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Maraton {

    Map<Integer,Atleta> atletas= new HashMap<>();

    public void inscribirAtleta(Atleta a){
        atletas.put(a.getDorsal(),a);
        System.out.println("El atleta ha sido inscrito.");
    }

    public Map<Integer, Atleta> getAtletas() {
        return atletas;
    }

    public void guardarTiempo(Integer dorsal, Integer segundos){
        if (atletas.containsKey(dorsal)){
            atletas.get(dorsal).setMarcaSegundos(segundos);
            atletas.get(dorsal).setFinisher(true);

            System.out.println("La marca ha sido guardada correctamente.");
        }else{
            System.out.println("Ese dorsal no existe.");
        }

    }

    public void deleteAtleta(Integer dorsal){
        if (atletas.containsKey(dorsal)){
            atletas.remove(dorsal);
            System.out.println("Se ha eliminado correctamente.");
        }else {
            System.out.println("El dorsal no existe.");
        }
    }

    public void mostrarListaFinishers(){
        Collection<Atleta> listaAtletas = atletas.values();

        ArrayList<Atleta> listaAtletasFinishers= new ArrayList<>();

        for (Atleta a: listaAtletas) {
            if (a.isFinisher()){
                listaAtletasFinishers.add(a);
            }
        }

        Collections.sort(listaAtletasFinishers);

        System.out.println(listaAtletasFinishers);

    }

    public void mostrarListaCategorias(Categorias c1){
        Collection<Atleta> listaAtletas = atletas.values();

        ArrayList<Atleta> listaAtletasCategoria= new ArrayList<>();

        for (Atleta a: listaAtletas) {
            if (a.getCategoria().equals(c1)){
                listaAtletasCategoria.add(a);
            }
        }

        Collections.sort(listaAtletasCategoria);

        System.out.println(listaAtletasCategoria);
    }

    public void participantesPorPais(String pais){
        int c=0;
        Collection<Atleta> listaAtletas = atletas.values();

        for (Atleta a: listaAtletas) {
            if (a.getPais().equals(pais)){
                c++;
            }
        }

        System.out.println("El país "+pais+" tiene "+c+" participantes.");
    }

    public void mostrarAtletas(){
        Collection<Atleta> collectionAtletas = atletas.values();

        ArrayList<Atleta> listaAtletas = new ArrayList<>(collectionAtletas);

        Collections.sort(listaAtletas, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta o1, Atleta o2) {
                return o1.getDorsal()-o2.getDorsal();
            }
        });

        System.out.println(listaAtletas);

    }

    public void deleteAll(){
        atletas.clear();
        System.out.println("Se han eliminado todos los atletas.");
    }

}
