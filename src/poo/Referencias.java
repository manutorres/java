package poo;

public class Referencias {
    public static void main(String[] args) {
        var cuadroDeTexto1 = new CuadroDeTexto();
        var cuadroDeTexto2 = cuadroDeTexto1;
        cuadroDeTexto2.setTexto("Texto de instancia 2");
        System.out.println(cuadroDeTexto1.texto);
    }
}