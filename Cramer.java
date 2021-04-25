public class Cramer {
    private Equation equation;

    public Cramer(double a, double b, double c) {
        this.equation = new Equation(a, b, c);
    }

    public Equation getEquation() {
        return this.equation;
    }

    public Point solve(Cramer other) {
        Point result = new Point();
        double d = this.equation.getA() * other.equation.getB() - other.equation.getA() * this.equation.getB();
        double dx = this.equation.getC() * other.equation.getB() - other.equation.getC() * this.equation.getB();
        double dy = this.equation.getA() * other.equation.getC() - other.equation.getA() * this.equation.getC();
        if (d == 0) {
            if (dx == dy) {
                System.out.println("Invalid");
            } else {
                System.out.println("Invalid1");
            }
        } else {
            result.setX(dx / d);
            result.setY(dy / d);
            double r = Math.sqrt(Math.pow(ix - point.get(0), 2) + Math.pow(iy - point.get(1), 2));
            System.out.println(
                    String.format("Phuong trinh duong tron co dang (x - %f)^2 + (y - %f)^2 = %f^2", ix, iy, r));
        }
        return result;
    }

}