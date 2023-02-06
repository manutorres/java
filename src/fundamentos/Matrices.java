package fundamentos;

import java.util.Arrays;

public class Matrices {
    public static void main(String[] args){
        int[][] numeros = new int[2][3];
        numeros[1][1] = 2;
        System.out.println(Arrays.deepToString(numeros));

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matriz));
    }
}
