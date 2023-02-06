package flujodecontrol;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        /*
        while (!input.equals("salir")){
            System.out.print("Ingrese el comando: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("salir"))
                System.out.println("Ingreso: " + input);
        }
        */

        // While true con sentencia break
        while (true){
            System.out.print("Ingrese el comando: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pasar"))
                continue;
            if (input.equals("salir"))
                break;
            System.out.println("Ingreso: " + input);
        }

        /*
        // Ciclo do-while: se ejecuta al menos una vez sin chequear la condición
        do{
            System.out.print("Ingrese el comando: ");
            input = scanner.next().toLowerCase();
            System.out.println("Ingreso: " + input);
        } while (!input.equals("salir"));

        */
    }
}