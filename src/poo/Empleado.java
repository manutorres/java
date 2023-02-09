package poo;

public class Empleado {
    private int sueldoBase;
    private int valorHora;

    public int calcularSueldo(int horasExtra){
        return this.sueldoBase + (horasExtra * this.valorHora);
    }

    public void setSueldoBase(int sueldoBase){
        if(sueldoBase <= 0)
            throw new IllegalArgumentException("El sueldo no puede ser igual o menor a 0.");
        this.sueldoBase = sueldoBase;
    }

    public int getSueldoBase(){
        return this.sueldoBase;
    }

    public void setValorHora(int valorHora) {
        if(valorHora <= 0)
            throw new IllegalArgumentException("El valor por hora no puede ser igual o menor a 0.");
        this.valorHora = valorHora;
    }

    public int getValorHora(){
        return this.valorHora;
    }
}
