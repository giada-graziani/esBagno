package com.example;

public class Persona extends Thread{
    private Bagno b;
    private String nome;
    public Persona( String nome, Bagno b){
        this.nome= nome;
        this.b= b;
    }

    //metodo get nome
    public String getNome() {
        return nome;
    }

    public void run(){
        try {
            this.b.getS().acquire();
            int num= b.entra();
            System.out.println(nome +" è entrato nel bagno");
            Thread.sleep(num);
            b.esci(this);
            this.b.getS().release();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
