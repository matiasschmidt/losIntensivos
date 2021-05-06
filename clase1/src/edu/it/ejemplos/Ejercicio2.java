package edu.it.ejemplos;

public class Ejercicio2 implements Runnable {
    public void run() {
        String apellidos = "VALDEZ;LOZANO;GALLARDO";
        String nombres = "nicolas;cesar;joaquin";
        
        System.out.println(apellidos);
        System.out.println(nombres);
        
        for (String ape : apellidos.split(";")) {
            for (String nom : nombres.split(";")) {
                System.out.println(ape + ", " + nom);
            }
        }
    }
}
