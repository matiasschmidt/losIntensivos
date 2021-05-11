package edu.it.ejemplos;

public class Gato implements Duenio, Veterinario {
    public void alimentar() {
        System.out.println("Gracias por darme mi comidita");
    }
    public void vacunar() {
        System.out.println("Hayy como duele");
    }
    public void castrar(String machoHembra) {
        System.out.println("Estaba dormido no me acuerdo");
        if (machoHembra.equals("macho")) {
            System.out.println("Me ataron y ya fue");
        }
        if (machoHembra.equals("hembra")) {
            System.out.println("Me operron y quede divina");
        }
    }
}
