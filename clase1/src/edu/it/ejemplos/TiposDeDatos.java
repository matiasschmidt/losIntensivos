package edu.it.ejemplos;

public class TiposDeDatos implements Runnable {
    public void run() {
        for (byte b = 1; b < 200; b++) {
            System.out.println(b);
        }
        /*
        short 2 bytes 2 a la 15 tanto - como +
        int 4 bytes entonces 2 a la 31 tanto - como +
        long 8 bytes entonces 2 a la 61 tanto - como +
        float 4 bytes (ver spec)
        double 8 bytes (ver spec)
        boolean (true, false)
        char 1 byte pero solo en un encoding determinado
        */
        Byte uno;
        Short dos;
        Integer tres;
        Long cuatro;
        Float cinco;
        Double seis;
        Boolean siete;
        Object ocho; // Puede apuntar a cualquier tipo de datos
        // padre/madre de todos los tipos de datos
    }
}
