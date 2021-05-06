package edu.it.ejemplos;

import java.util.Scanner;

public class IngresoPorConsola implements Runnable {
    public void run() {
        Scanner scn = new Scanner(System.in);
        
        try {
            String s = scn.nextLine();
            Runnable r = (Runnable)Class.forName(s).newInstance();
            r.run();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
