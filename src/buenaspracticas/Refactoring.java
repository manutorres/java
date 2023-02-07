package buenaspracticas;

import java.text.NumberFormat;
import java.util.Scanner;

public class Refactoring {

    public static void main(String[] args) {
        int capital = (int)leerNumero("Capital: ", 1000, 1_000_000);
        float interesAnual = (float)leerNumero("Interés anual:", 0, 60);
        byte anios = (byte)leerNumero("Período (Años):", 1, 10);

        double hipoteca = calcularHipoteca(capital, interesAnual, anios);

        String hipotecaFormateada = NumberFormat.getCurrencyInstance().format(hipoteca);
        System.out.println("Hipoteca: " + hipotecaFormateada);
    }

    public static double leerNumero(
            String mensaje,
            double min,
            double max
    ){
        Scanner scanner = new Scanner(System.in);
        double valor;
        while (true){
            System.out.print(mensaje);
            valor = scanner.nextFloat();
            if(valor >= min && valor <= max)
                break;
            System.out.println("Ingrese un valor entre " + min + " y " + max);
        }
        return valor;
    }

    public static double calcularHipoteca(
            int capital,
            float interesAnual,
            byte anios
    ){
        return 200000;
    }

}