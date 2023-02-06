package flujodecontrol;

public class Condicionales {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30){
            System.out.println("Hace calor");
        } else if (temp > 20){
            System.out.println("Linda tarde");
        } else {
            System.out.println("Hace frío");
        }

        // If simplificado en asignación
        boolean haceFrio = (temp < 15);

        // Operador ternario
        int edad = 30;
        String condicion = (edad >= 18) ? "Mayor" : "Menor";
        System.out.println(condicion);
    }
}
