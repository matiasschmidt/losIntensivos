package edu.it.ejemplos;

public class EjemploStatic {
    public static int suma(Integer ...operandos) {
        int acumulador = 0;
        for (Integer x : operandos) {
            acumulador += x;
        }
        return acumulador;
    }
}
