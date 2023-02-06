package fundamentos;

public class ClaseMath {
    public static void main(String[] args){
        int resultado = Math.round(1.1F);
        System.out.println(resultado);

        int piso = (int)Math.floor(4.3F);
        System.out.println(piso);

        int maximo = Math.max(5, 6);
        System.out.println(maximo);

        int rand = (int)Math.round(Math.random() * 100);
        System.out.println(rand);
    }
}
