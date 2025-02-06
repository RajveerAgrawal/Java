import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names you want to add:");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter the names:");
        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }
        System.out.println("Enter the name you want to search for:");
        String searchName = scanner.nextLine();
        names.forEach(name -> {
            if (name.equalsIgnoreCase(searchName)) {
                System.out.println("Eureka");
            }
        });

        scanner.close();
    }
}
