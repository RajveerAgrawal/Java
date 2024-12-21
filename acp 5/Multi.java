import java.util.Scanner;

class Calculator {
    void displayWelcomeMessage() {
        System.out.println("Welcome to the Calculator Program!");
    }
}

class Addition extends Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

class Subtraction extends Addition {
    int subtract(int a, int b) {
        return a - b;
    }
}

class Multiplication extends Subtraction {
    int multiply(int a, int b) {
        return a * b;
    }
}

class Division extends Multiplication {
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }
}

public class Multi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Division calculator = new Division();
        calculator.displayWelcomeMessage();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + calculator.divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        scanner.close();
    }
}
