package com.company;

public interface Correr {
    public default void correr(){
        System.out.println("Voy a correr");
    }
}
