package buenaspracticas;

public class Metodos {
    public static void main(String[] args){
        saludar("Nico", "Perez");
        String saludo = armarSaludo("Marcos", "Gonzalez");
        System.out.println(saludo);
    }

    public static void saludar(String nombre, String apellido){
        System.out.println("Hola " + nombre + " " + apellido);
    }

    // Metodo con valor de retorno
    public static String armarSaludo(String nombre, String apellido){
        return "Hola " + nombre + " " + apellido;
    }
}
