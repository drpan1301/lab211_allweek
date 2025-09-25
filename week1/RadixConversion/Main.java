package RadixConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nNumber Base Converter");
            System.out.println("1. Binary (base 2)");
            System.out.println("2. Decimal (base 10)");
            System.out.println("3. Hexadecimal (base 16)");
            System.out.print("Choose input base system (1-3, 0 to exit): ");
            int fromChoice = scanner.nextInt();
            if (fromChoice == 0) break;
            System.out.print("Choose output base system (1-3): ");
            int toChoice = scanner.nextInt();
            if (toChoice < 1 || toChoice > 3) {
                System.out.println("Invalid output base choice.");
                continue;
            }
            int fromBase = getBase(fromChoice);
            int toBase = getBase(toChoice);
            System.out.print("Enter the input value: ");
            String inputValue = scanner.next();
            try {
                String result = BaseConversion.convert(inputValue, fromBase, toBase);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Invalid input or conversion error: " + e.getMessage());
            }
        }
        System.out.println("Exiting program.");
    }

    private static int getBase(int choice) {
        switch (choice) {
            case 1: return 2;
            case 2: return 10;
            case 3: return 16;
            default: throw new IllegalArgumentException("Invalid base choice");
        }
    }
}