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

    public void qualifyBMI(double weight, double height) {
        height = height / 100; // convert cm to m
        double bmi = weight / (height * height);
        System.out.printf("BMI Number : %.2f", bmi);
        System.out.print("\n\n\nBMI Status : ");

        if (bmi < 19) {
            System.out.println("UNDERWEIGHT");
        } else if (bmi < 25) {
            System.out.println("STANDARD");
        } else if (bmi < 30) {
            System.out.println("OVERWEIGHT");
        } else if (bmi < 40) {
            System.out.println("OBESITY");
        }
        else {
            System.out.println("VERY OBESITY");
        }
    }
}