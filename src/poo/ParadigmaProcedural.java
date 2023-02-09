package poo;

public class ParadigmaProcedural {
    public static void main(String[] args) {
        int sueldoBase = 100_000;
        int horasExtra = 10;
        int valorHora = 20;

        int sueldo = calcularSueldo(sueldoBase, horasExtra, valorHora);
        System.out.println(sueldo);
    }

    public static int calcularSueldo(
        int sueldoBase,
        int horasExtra,
        int valorHora
    ){
        return sueldoBase + (horasExtra * valorHora);
    }
}