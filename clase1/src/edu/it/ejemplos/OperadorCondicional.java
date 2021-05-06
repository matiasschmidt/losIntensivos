package edu.it.ejemplos;

public class OperadorCondicional {
    public void run() {
        Integer x1 = 11;
        Integer z1 = null;
        Integer z2 = null;
        
        if (x1 == 10) {
            z1 = 1000;
        }
        else {
            z1 = 1001;
        }
        
        z2 = (x1==10) ? 1000 : 1001;
        
        System.out.println(z1);
        System.out.println(z2);
    }
}
