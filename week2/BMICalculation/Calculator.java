package BMICalculation;

public class Calculator {
    public Calculator() {
        this.memory = 0;
    }

    public Calculator(double initialValue) {
        this.memory = initialValue;
    }
    private double memory;

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory){
        this.memory = memory;
    }

    public double calculator(double memory){
        this.memory = memory;
        return this.memory;
    }

    public void calculator(String op, double number){
        switch (op) {
            case "+":
                memory += number;
                break;
            case "-":
                memory -= number;
                break;
            case "*":
                memory *= number;
                break;
            case "/":
                if (number != 0) {
                    memory /= number;
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case "^":
                memory = Math.pow(memory, number);
                break;
            default:
                System.out.println("Please input (+, -, *, /,^)");
                break;
        }
    }
}