import java.util.Scanner;

// Custom exception class
class InvalidInternException extends Exception {
    public InvalidInternException(String message) {
        super(message);
    }
}

// Candidate class definition
class Candidate {
    private String name;
    private String gender;
    private int percentage;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    // Getters for displaying information
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getPercentage() {
        return percentage;
    }
}

public class Main {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter the candidate details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();  // Changed to nextLine() to accept full names
            
            System.out.print("Gender: ");
            String gender = scanner.next();
            
            System.out.print("Enter Percentage in 10th: ");
            int percentage = scanner.nextInt();

            if (percentage < 50) {
                throw new InvalidInternException("Registration Failed. Percentage cannot be less than 50%.");
            }

            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);

            return candidate;
        } finally {
            scanner.close(); // Closing scanner to prevent resource leak
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to InternHiring Tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful!");
            System.out.println("Candidate Details:");
            System.out.println("Name: " + candidate.getName());
            System.out.println("Gender: " + candidate.getGender());
            System.out.println("Percentage: " + candidate.getPercentage() + "%");
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}
