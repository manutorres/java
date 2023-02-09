package poo;

public class Encapsulamiento {
    public static void main(String[] args) {
        var empleado = new Empleado();
        // empleado.sueldoBase = 100_000;
        // empleado.valorHora = 20;
        int horasExtra = 10;

        int sueldo = empleado.calcularSueldo(horasExtra);
        System.out.println(sueldo);
    }
}