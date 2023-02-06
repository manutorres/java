package fundamentos;

import java.util.Scanner;

public class InputUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        // nextLine: consume la linea, no tokens individuales
        String nombre = scanner.nextLine().trim();
        System.out.println("Usted es: " + nombre);

        System.out.print("Edad: ");
        byte edad = scanner.nextByte();
        System.out.println("Su edad es: " + edad);
    }
}