package poo;

public class SettersYGetters {
    public static void main(String[] args) {
        var empleado = new Empleado();
        empleado.setSueldoBase(100_000);
        empleado.setValorHora(20);
        int horasExtra = 10;

        int sueldo = empleado.calcularSueldo(horasExtra);
        System.out.println(sueldo);
    }
}
