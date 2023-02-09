package poo;

public class CuadroDeTexto {
    // Atributos o campos (no deberían ser públicos)
    // Inicializado con un valor para evitar errores de acceso
    public String texto = "";

    // Métodos
    public void setTexto(String texto){
        this.texto = texto;
    }

    public void limpiar(){
        this.texto = "";
    }
}
