package edu.it.ejemplos;

public class Ejercicio1 implements Runnable {
    public void run() {
        String[] nombres = {"nicolas", "cesar" ,"joaquin"};
        String[] apellidos = {"VALDEZ", "LOZANO" ,"GALLARDO"};

        System.out.println("La combinacion seria:");

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < apellidos.length; j++) {
                System.out.println((nombres[i]) + " " + apellidos[j]);
            }
        }
        
        System.out.println("");
        
        for (String ape : apellidos) {
            for (String nom : nombres) {
                System.out.println(ape + ", " + nom);
            }
        }
    }
}
