
import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);

    public static Point input() {
        System.out.print("x = ");
        double a = sc.nextDouble();
        System.out.print("y = ");
        double b = sc.nextDouble();
        return new Point(a, b);
    }

    public static String equationCircle(Point i, double r) {
        String result = String.format("Equation circle: (x-%.2f)^2 + (y-%.2f)^2 = %.2f^2", i.getX(), i.getY(), r);
        return result.replaceAll("--", "+");
    }

    public static void main(String[] args) {
        Point a, b, c;
        System.out.println("Enter A(x,y): ");
        a = input();
        System.out.println("Enter B(x,y): ");
        b = input();
        System.out.println("Enter C(x,y): ");
        c = input();

        double a1 = (-2 * a.getX() + 2 * b.getX());
        double a2 = (-2 * a.getX() + 2 * c.getX());
        double b1 = (-2 * a.getY() + 2 * b.getY());
        double b2 = (-2 * a.getY() + 2 * c.getY());
        double c1 = -(Math.pow(a.getX(), 2) - Math.pow(b.getX(), 2) + Math.pow(a.getY(), 2) - Math.pow(b.getY(), 2));
        double c2 = -(Math.pow(a.getX(), 2) - Math.pow(c.getX(), 2) + Math.pow(a.getY(), 2) - Math.pow(c.getY(), 2));

        Equation equation1 = new Equation(a1, b1, c1);
        Equation equation2 = new Equation(a2, b2, c2);

        Cramer cramer = new Cramer(equation1);
        Point iPoint = cramer.solve(equation2);
        if (iPoint != null) {
            double r = a.getDistance(iPoint);
            System.out.println(equationCircle(iPoint, r));
        } else {
            System.out.println("Invalid");
        }
    }
}