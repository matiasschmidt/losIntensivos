package edu.it;

import edu.it.ejemplos.*;

public class Init {
    public static void main(String... params) {
        System.out.println("Bienvenidos a JAVA");

        GettersYSetters gys = new GettersYSetters();
        gys.setVelocidad(50);
        gys.incrementar();
        gys.incrementar();
        gys.disminuir();
        System.out.println(gys.getCantCambios());
        
    }
}
