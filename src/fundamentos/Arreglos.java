package fundamentos;

import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args){
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;

        // Excepcion:
        // numeros[10] = 3;

        System.out.println(Arrays.toString(numeros));

        // Inicializacion abreviada
        int[] numeros2 = {3, 2, 5, 1, 4};
        Arrays.sort(numeros2);
        System.out.println(Arrays.toString(numeros2));
    }
}
