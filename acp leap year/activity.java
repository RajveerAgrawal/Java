import java.util.Scanner;

class Year {
    private int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public int getYear() {
        return year;
    }
}

public class activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int inputYear = scanner.nextInt();

        Year year = new Year(inputYear);

        if (year.isLeapYear()) {
            System.out.println(year.getYear() + " is a leap year.");
        } else {
            System.out.println(year.getYear() + " is not a leap year.");
        }

        scanner.close();
    }
}
