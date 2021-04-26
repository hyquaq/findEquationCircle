public class Cramer {
    private Equation equation;

    public Cramer(double a, double b, double c) {
        this.equation = new Equation(a, b, c);
    }

    public Cramer(Equation other) {
        this.equation = other;
    }

    public Equation getEquation() {
        return this.equation;
    }

    public Point solve(Equation other) {
        Point result = new Point();
        double d = this.equation.getA() * other.getB() - other.getA() * this.equation.getB();
        double dx = this.equation.getC() * other.getB() - other.getC() * this.equation.getB();
        double dy = this.equation.getA() * other.getC() - other.getA() * this.equation.getC();
        if (d == 0) {
            if (dx == dy) {
                return null;
            } else {
                return null;
            }
        } else {
            // nghiem cua he phuong trinh
            result.setX(dx / d);
            result.setY(dy / d);
        }
        return result;
    }
}