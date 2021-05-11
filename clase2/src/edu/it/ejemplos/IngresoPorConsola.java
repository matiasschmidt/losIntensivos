package edu.it.ejemplos;

import java.util.Scanner;

public class IngresoPorConsola implements Runnable {
    public void run() {
        Scanner scn = new Scanner(System.in);
        
        try {
            String s = scn.nextLine();
            Object o = Class.forName(s).newInstance();
            Runnable r = (Runnable)o;
            r.run();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
