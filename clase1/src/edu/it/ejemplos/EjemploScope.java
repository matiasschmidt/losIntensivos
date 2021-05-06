package edu.it.ejemplos;

class Conexion {
    public String idConexion;
    public String nombreConexion;

    public Conexion() {
        idConexion = "";
        nombreConexion = "";
    }
}

public class EjemploScope {
    public void run() {
        Conexion c = null;
        Conexion d = null;
        {
            // Scope
            c = new Conexion();
        }
        {
            c.idConexion = "1";
            c.nombreConexion = "http";
            String s = "Saludos";
        }
        {
            d = new Conexion();
            d.nombreConexion = "2";
            d.nombreConexion = "tcp";
        }
        {
            d = c;
            System.out.println(d.idConexion);
            System.out.println(d.nombreConexion);
        }
    }
}
