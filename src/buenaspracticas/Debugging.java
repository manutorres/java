package buenaspracticas;

public class Debugging {
    public static void main(String[] args) {
        System.out.println("Comienzo");
        imprimirNumeros(5);

        // Problema: termina en 4 y no imprime el 5

        System.out.println("Fin");
    }

    public static void imprimirNumeros(int limite){
        // Breakpoint en el metodo para conocer valor de variables
        for(int i=1; i<limite; i++)
            System.out.println(i);
    }
}