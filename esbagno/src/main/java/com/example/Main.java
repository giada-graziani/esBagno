package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bagno b= new Bagno();
        Persona p1= new Persona("goffredo",b);
        Persona p2= new Persona("gulielmo",b);
        Persona p3= new Persona("augusto",b);

        ArrayList<Persona> lista= new ArrayList<Persona>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for(int i =0; i<lista.size();i++){
            lista.get(i).start();
        }
    }
}