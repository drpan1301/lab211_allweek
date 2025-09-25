package PACalculation;

public class ShapeExponent {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        while (true) {
            System.out.println("========== Calculator Calculator ==========");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.print("Please choice one option: ");
            int choice = getValidInt(sc);
            if(choice == 3){
                System.out.println("Exiting program...");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("\n---- Normal Calculator ----");
                    System.out.print("Enter number: ");
                    double initialValue = getValidDoubleNormal(sc);
                    Calculator calc = new Calculator(initialValue);
                    while(true){
                        String op = getValidOperator(sc);
                        if (op.equalsIgnoreCase("=")) {
                            System.out.println("Result: " + calc.getMemory());
                            break; 
                        }
                        System.out.print("Enter number: ");
                        double number = getValidDoubleNormal(sc);
                        calc.calculator(op, number);
                        System.out.println("Memory: " + calc.getMemory());
                    }
                    break;
                case 2:
                    System.out.println("\n----- BMI Calculate -----");
                    System.out.print("Enter Weight(kg): ");
                    double weight = getValidDoubleBMI(sc,1);
                    System.out.print("Enter Height(cm): ");
                    double height = getValidDoubleBMI(sc,2);
                    Calculator bmiCalc = new Calculator();
                    bmiCalc.qualifyBMI(weight, height);
                    break;
                default:
                    System.out.println("Invalid option. Please select 1-3.");
            }
            
        }
    }
}