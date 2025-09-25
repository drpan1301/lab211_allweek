package SolvingMath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n========== Equation Program ==========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.print("Please choice one option: ");
            int option = getValidInt(scanner);
            if (option == 3) {
                System.out.println("Exiting program...");
                break;
            }
            switch (option) {
                case 1:
                    System.out.println("\n---- Calculate Equation ----");
                    System.out.print("Enter A: ");
                    double a1 = getValidDouble(scanner);
                    System.out.print("Enter B: ");
                    double b1 = getValidDouble(scanner);
                    System.out.println("Solution: " + MathSolver.solveLinear(a1, b1));
                    printEvenOddSquare((int)a1, (int)b1);
                    break;
                case 2:
                    System.out.println("\n----- Calculate Quadratic Equation -----");
                    System.out.print("Enter A: ");
                    double a2 = getValidDouble(scanner);
                    System.out.print("Enter B: ");
                    double b2 = getValidDouble(scanner);
                    System.out.print("Enter C: ");
                    double c2 = getValidDouble(scanner);
                    System.out.println("Solution: " + MathSolver.solveQuadratic(a2, b2, c2));
                    printEvenOddSquare((int)a2, (int)b2, (int)c2);
                    break;
                default:
                    System.out.println("Invalid option. Please select 1-3.");
            }
        }
    }

    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void printEvenOddSquare(int... nums) {
        StringBuilder evenList = new StringBuilder();
        StringBuilder oddList = new StringBuilder();
        StringBuilder squareList = new StringBuilder();
        for (int n : nums) {
            String formatted = String.format("%.1f", (double) n);
                if (MathSolver.isEven(n)) {
                    evenList.append(formatted).append(", ");
                }
                if (MathSolver.isOdd(n)) {
                    oddList.append(formatted).append(", ");
                }
                if (MathSolver.isSquare(n)) {
                    squareList.append(formatted).append(", ");
                }
        }
        if (evenList.length() > 0) {
                evenList.setLength(evenList.length() - 2); 
                System.out.print("Number is Even: " + evenList);
        } else {
            System.out.print("Number is Even: (none)");
        }
        System.out.println(",");
        if (oddList.length() > 0) {
                oddList.setLength(oddList.length() - 2);
                System.out.println("Number is Odd: " + oddList);
        } else {
            System.out.println("Number is Odd: (none)");
        }
        System.out.println("");
        if (squareList.length() > 0) {
                squareList.setLength(squareList.length() - 2);
                System.out.println("Number is Square: " + squareList);
        } else {
            System.out.println("Number is Square: (none)");
        }
    }
}