package poo;

public class Instancias {

    public static void main(String[] args){
        var cuadroDeTexto1 = new CuadroDeTexto();
        cuadroDeTexto1.setTexto("Texto de prueba");
        System.out.println(cuadroDeTexto1.texto); // Acceso a atributo

        var cuadroDeTexto2 = new CuadroDeTexto();
        cuadroDeTexto2.setTexto("Otra instancia!");
        System.out.println(cuadroDeTexto2.texto);
    }
}
