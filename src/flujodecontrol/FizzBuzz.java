package flujodecontrol;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        byte numero = scanner.nextByte();

        String resultado = (numero % 5 == 0) ? "Fizz" : "";
        if (numero % 3 == 0){
            resultado += "Buzz";
        }
        if (resultado == ""){ // == funciona al comparar literales (no referencias)
            resultado = Integer.toString(numero);
        }
        System.out.println(resultado);
    }
}
