package edu.it.ejemplos;

// Data Transfer Object
class Cliente {
    public String id;
    public String nombre;
    public String apellido;
    public Integer edad;
}

interface ValidadorCliente {
    void validar(Cliente c);
} 

class ValidadorClienteHipoteca implements ValidadorCliente {
    public void validar(Cliente c) {
        // Solo se va a fijar en la edad
    }
}

class ValidadorVentaRubroGeneral implements  ValidadorCliente {
    public void validar(Cliente c) {
        // Solo se fija si tiene deuda
    }
}

public class EjemploDTO implements Runnable {
    public void run() {
        /*
        Tema validacion 
        Como valido ? si es todo public
        
        Supongamos que ofrecemos creditos para clientes
        de hasta 60 años.
        
        setEdad(Integer edad) {
            // aca hacian la validacion
            // if (edad > 60) {
                arrojo error
            }
        }
        
        validadorCliente (no me importa cual)
        les suena ???? encapsulamiento
        
        validadorCliente.validar(cliente);
        
        */
    }
}
