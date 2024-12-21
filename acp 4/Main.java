import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter class: ");
        String studentClass = scanner.nextLine();

        String[] subjects = {"English", "Mathematics", "Social Science", "Chemistry", "Physics", "Biology"};
        int[] marks = new int[subjects.length];
        int totalMarks = 0;

        System.out.println("\nEnter marks for the following subjects:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double percentage = (double) totalMarks / subjects.length;

        System.out.println("\n----------------------------------------");
        System.out.println("              REPORT CARD               ");
        System.out.println("----------------------------------------");
        System.out.println("NAME: " + name);
        System.out.println("CLASS: " + studentClass);
        System.out.println("----------------------------------------");
        System.out.println("SUBJECT             MARK");
        System.out.println("----------------------------------------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-20s %d%n", subjects[i], marks[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL: " + totalMarks + "  AVERAGE: " + String.format("%.2f", percentage));
        System.out.println("----------------------------------------");

        scanner.close();
    }
}
