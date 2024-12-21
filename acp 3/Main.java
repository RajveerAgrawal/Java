import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit number (digits in decreasing order): ");
        int number = scanner.nextInt();

        int reversed = reverseNumber(number);

        int difference = number - reversed;

        int reversedDifference = reverseNumber(difference);

        int result = difference + reversedDifference;

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
        System.out.println("Difference (Original - Reversed): " + difference);
        System.out.println("Reversed Difference: " + reversedDifference);
        System.out.println("Final Result (Difference + Reversed Difference): " + result);

        if (result == 1089) {
            System.out.println("Magic! The result is always 1089.");
        } else {
            System.out.println("Something went wrong. Please ensure the input follows the rules.");
        }

        scanner.close();
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;  
            reverse = reverse * 10 + digit; 
            num /= 10; 
        }
        return reverse;
    }
}
