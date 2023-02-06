package fundamentos;

public class Casteo {
    public static void main(String[] args) {
        // Casting implicito cuando no hay perdida de datos
        // byte > short > int > long > float > double
        double x = 1.1;
        double y = x + 2;
        System.out.println(y);

        // Casting explicito
        int z = (int)x + 2;
        System.out.println(z);

        // Wrapper class para castear tipos incompatibles
        String s = "1";
        int w = Integer.parseInt(s) + 2;
        System.out.println(w);


    }
}
