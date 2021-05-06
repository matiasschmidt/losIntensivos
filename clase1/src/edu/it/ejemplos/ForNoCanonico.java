package edu.it.ejemplos;

public class ForNoCanonico implements Runnable {
    public void run() {
        
        for (long l = System.currentTimeMillis() / 100;l < 16202678889L;) {
            System.out.println(l);
            l = System.currentTimeMillis() / 100;
        }
        System.out.println("Fin");
    }
}
