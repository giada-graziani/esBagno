package com.example;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Bagno {
    private Semaphore s = new Semaphore(1);
    ArrayList<Persona> listaN = new ArrayList<Persona>();

    //metodo get
    public Semaphore getS() {
        return s;
    }
    
    //metodo entra
    public int entra(){
        int num = (int) (Math.random()*1000);
        return num;
    }

    //metodo esci
    public void esci(Persona p){
        System.out.println( p.getNome()+" è uscito dal bagno");
    }


}
