package flujodecontrol;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        boolean xMayor = x > y;
        System.out.println(xMayor);

        System.out.println(x == 4);

        int temperatura = 25;
        boolean estaCalido = temperatura >= 20 & temperatura < 30;
        System.out.println(estaCalido);

        boolean lloviendo = false;
        // Doble signo = evaluacion con corto circuito: No evalua si no es necesario
        boolean quedarseEnCasa = !estaCalido || lloviendo;
        System.out.println(quedarseEnCasa);

    }
}
