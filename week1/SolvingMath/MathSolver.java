package SolvingMath;

public class MathSolver {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isSquare(int n) {
        if (n < 0) return false;
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    public static String solveLinear(double a, double b) {
        if (a == 0) {
            if (b == 0) return "Infinite solutions";
            else return "No solution";
        }
        double x = -b / a;
        return String.format("x = %.3f", x);
    }

    public static String solveQuadratic(double a, double b, double c) {
        if (a == 0) return solveLinear(b, c);
        double delta = b * b - 4 * a * c;
        if (delta < 0) return "No real solution";
        double sqrtDelta = Math.sqrt(delta);
        double x1 = (-b + sqrtDelta) / (2 * a);
        double x2 = (-b - sqrtDelta) / (2 * a);
        return String.format("x1 = %.3f and x2 = %.3f", x1, x2);
    }
}
