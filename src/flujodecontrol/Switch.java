package flujodecontrol;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rol: ");
        String rol = scanner.next();

        switch (rol){
            case "admin":
                System.out.println("Usted es administrador.");
                break;
            case "mod":
                System.out.println("Usted es moderador.");
                break;
            default:
                System.out.println("Usted es invitado");
        }
    }
}