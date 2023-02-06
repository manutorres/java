package flujodecontrol;

public class ForEach {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Durazno", "Frutilla"};

        for (int i=0; i<frutas.length; i++)
            System.out.println(frutas[i]);

        // Foreach: Mas simple pero no se conoce el índice ni permite orden inverso
        for (String fruta: frutas){
            System.out.println(fruta);
        }
    }
}
