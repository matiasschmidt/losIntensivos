package edu.it;

import edu.it.ejemplos.*;
import static edu.it.ejemplos.EjemploStatic.suma;

public class Init {
    public static void main(String... params) {
        System.out.println("Bienvenidos a JAVA");

        GettersYSetters gys = new GettersYSetters();
        gys.setVelocidad(50);
        gys.incrementar();
        gys.incrementar();
        gys.disminuir();
        System.out.println(gys.getCantCambios());
        
        System.out.println(suma(2,3,4,5,6));       
    }
}
