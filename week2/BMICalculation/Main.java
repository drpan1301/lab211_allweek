package BMICalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double initialValue = sc.nextDouble();
        Calculator calc = new Calculator(initialValue);
        
        while (true) {
            String op = getValidOperator(sc);
            if (op.equalsIgnoreCase("=")) {
                System.out.println("Result: " + calc.getMemory());
                return;
            }
            System.out.print("Enter number: ");
            double number = sc.nextDouble();
            calc.calculator(op, number);
            System.out.println("Memory: " + calc.getMemory());
        }
    }

    public static String getValidOperator(Scanner scanner) {
        while (true) {
            System.out.print("Enter operator: ");
            String op = scanner.next();
            if (op.equals("=")) {
                return op;
            }
            if ("+-*/^".contains(op) && op.length() == 1) {
                return op;
            } else {
                System.out.println("Please input (+, -, *, /, ^)");
            }
        }
    }


}