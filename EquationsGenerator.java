import java.util.Random;

public class EquationsGenerator {

    public static void main(String[] args) {
        generateEquation();
    }

    public static void generateEquation() {
        Random random = new Random();
        
        // Randomly pick an equation type
        int equationType = random.nextInt(4);

        switch (equationType) {
            case 0:
                generateLinearEquation();
                break;
            case 1:
                generateQuadraticEquation();
                break;
            case 2:
                generateCubicEquation();
                break;
            case 3:
                generateExponentialEquation();
                break;
            default:
                System.out.println("Invalid equation type.");
                break;
        }
    }

    // Generate a linear equation: y = mx + b
    public static void generateLinearEquation() {
        Random random = new Random();
        int m = random.nextInt(21) - 10; // Random slope between -10 and 10
        int b = random.nextInt(21) - 10; // Random intercept between -10 and 10
        System.out.println("Linear Equation: y = " + m + "x + " + b);
    }

    // Generate a quadratic equation: y = ax^2 + bx + c
    public static void generateQuadraticEquation() {
        Random random = new Random();
        int a = random.nextInt(21) - 10; // Random coefficient a
        int b = random.nextInt(21) - 10; // Random coefficient b
        int c = random.nextInt(21) - 10; // Random constant c
        System.out.println("Quadratic Equation: y = " + a + "x^2 + " + b + "x + " + c);
    }

    // Generate a cubic equation: y = ax^3 + bx^2 + cx + d
    public static void generateCubicEquation() {
        Random random = new Random();
        int a = random.nextInt(21) - 10; // Random coefficient a
        int b = random.nextInt(21) - 10; // Random coefficient b
        int c = random.nextInt(21) - 10; // Random coefficient c
        int d = random.nextInt(21) - 10; // Random constant d
        System.out.println("Cubic Equation: y = " + a + "x^3 + " + b + "x^2 + " + c + "x + " + d);
    }

    // Generate an exponential equation: y = a * e^(bx)
    public static void generateExponentialEquation() {
        Random random = new Random();
        int a = random.nextInt(21) - 10; // Random coefficient a
        int b = random.nextInt(21) - 10; // Random coefficient b
        System.out.println("Exponential Equation: y = " + a + " * e^(" + b + "x)");
    }
}
