import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> point = new ArrayList<Double>();
        for (int i = 1; i < 4; i++) {
            System.out.print("x[" + i + "]= ");
            double number = sc.nextDouble();
            point.add(number);
            System.out.print("y[" + i + "]= ");
            number = sc.nextDouble();
            point.add(number);
        }

        double a1 = (-2 * point.get(0) + 2 * point.get(2));
        double a2 = (-2 * point.get(0) + 2 * point.get(4));
        double b1 = (-2 * point.get(1) + 2 * point.get(3));
        double b2 = (-2 * point.get(1) + 2 * point.get(5));
        double c1 = -(point.get(0) * point.get(0) - point.get(2) * point.get(2) + point.get(1) * point.get(1)
                - point.get(3) * point.get(3));
        double c2 = -(point.get(0) * point.get(0) - point.get(4) * point.get(4) + point.get(1) * point.get(1)
                - point.get(5) * point.get(5));
        double d = a1 * b2 - a2 * b1;
        double dx = c1 * b2 - c2 * b1;
        double dy = a1 * c2 - a2 * c1;
        double ix, iy;
        if (d == 0) {
            if (dx == dy) {
                System.out.println("Invalid");
            } else {
                System.out.println("Invalid1");
            }
        } else {
            ix = dx / d;
            iy = dy / d;
            double r = Math.sqrt(Math.pow(ix - point.get(0), 2) + Math.pow(iy - point.get(1), 2));
            System.out.println(
                    String.format("Phuong trinh duong tron co dang (x - %f)^2 + (y - %f)^2 = %f^2", ix, iy, r));
        }

        sc.close();
    }
}