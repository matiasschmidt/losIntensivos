package edu.it.ejemplos;

public class EjemploMuestroInterfaces implements Runnable {
    private void vacunarPorOrdenDeLlegada(Veterinario[] vets) {
        for (Veterinario v : vets) {
            v.vacunar();
        }
    }
    public void run() {
        Gato gatito = new Gato();
        Veterinario veterinario = gatito;
        Duenio duenio = gatito;
        
        // voy a ver al objeto gato como un duenio
        duenio.alimentar();
        // voy a ver al objeto gato como un veterinario
        veterinario.vacunar();
        veterinario.castrar("Hembra");
    }
}
