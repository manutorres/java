package fundamentos;

import java.util.Date;

public class Tipos {
    public static void main (String[] args){
        int edad = 10;
        byte otraEdad = 20;
        int numero = 123456789;
        int numeroLegible = 123_456_789;
        // L para ser considerado long y no int
        long numeroGrande = 5_123_456_789L;
        // F para ser considera float y no double
        float precio = 10.99F;
        char letra = 'A';
        boolean esVerdadero = false;

        // Tipo por referencia: new aloca memoria del objeto
        Date hoy = new Date();
        System.out.println("Fecha de hoy:  " + hoy);

        // String es tipo por referencia con inicializacion abreviada
        String mensaje = "Hola amigos!";
        System.out.println(mensaje.endsWith("!"));
        String despedida = mensaje.replace("Hola", "Chau");
        // Los Strings son inmutables: no se puede modificar su valor
        System.out.println(mensaje);
        System.out.println(despedida);
    }
}
