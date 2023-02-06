package fundamentos;

import java.awt.*;

public class Referencia {
    public static void main(String[] args){
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println("Y:" + y);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        // Point1 y 2 son referencias al mismo objeto Point
        System.out.println("Point2:" + point2);

    }
}
