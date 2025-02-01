import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            int x = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the second number:");
            int y = Integer.parseInt(sc.nextLine());

            int z = x / y;
            System.out.println("Result of division: " + z);

            System.out.println("Enter two values for the array:");
            int[] array = new int[2];
            array[0] = Integer.parseInt(sc.nextLine());
            array[1] = Integer.parseInt(sc.nextLine());

            System.out.println("Accessing the third element: " + array[2]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Invalid input, please enter a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: Attempted to access an invalid array index.");
        } catch (Exception e) {
            System.out.println("General Exception: An unexpected error occurred - " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
