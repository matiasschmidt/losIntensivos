package edu.it.ejemplos;

public class EstructurasDeControl implements Runnable {
    public void run() {
        Integer[] arrayEnteros = new Integer[] {2,4,6};
        
        for (Integer x : arrayEnteros) {
            System.out.println(x);
        }
    }
}
