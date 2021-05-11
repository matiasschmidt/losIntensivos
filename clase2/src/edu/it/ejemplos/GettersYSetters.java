package edu.it.ejemplos;

public class GettersYSetters {
    public int velocidad;
    private int cantCambios;
    
    public void incrementar() {
        cantCambios++;
        velocidad ++;
    }
    public void disminuir() {
        cantCambios++;
        velocidad--;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        cantCambios++;
        this.velocidad = velocidad;
    }
    public int getCantCambios() {
        return cantCambios;
    }
}
