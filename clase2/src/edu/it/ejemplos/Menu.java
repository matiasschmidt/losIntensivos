package edu.it.ejemplos;

import java.util.Scanner;

class OpcionDelMenu {
    
}

class RespuestaDelMenu {
    
}

public class Menu implements mostrableXPantalla {
    public void mostrar() {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("1.- Para obtener su saldo");
        System.out.println("2.- Para obtener sus moviemientos");
        System.out.println("3.- Para obtener info de nuestros productos");
        
        scn.nextLine();
    }
}
