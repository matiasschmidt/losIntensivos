package edu.it.ejemplos;

public class Sobrecarga implements Runnable {
    private int suma(int x, int z) {
        return x + z;
    }
    private int suma(Integer ...params) {
        int acumulador = 0;
        for (Integer x : params) {
            acumulador += x;
        }
        return acumulador;
    }
    private double suma(double d1, double d2) {
        return d1 + d2;
    }
    public void run() {
        // 2 + 3 + 5
        Double z = suma(2d, suma(3d, 5d));
        System.out.println("El resultado de la suma es: " + z);
        int z2 = suma(2, 3, 5, 4, 3, 2, 5, 4, 3, 2, 1, 3, 7);
        System.out.println("El resultado de la suma es: " + z2);
    }
}
