package edu.it.ejemplos;

public class VariablesConstantes {
    public void run() {
        int x = 10;
        x++;
        final int z = 12;
        // z++; Esto es error, no compila.
        
        System.out.println("Valor de x = " + x);
        
    }
}
