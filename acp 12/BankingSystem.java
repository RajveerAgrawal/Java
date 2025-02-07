import java.util.Scanner;

class InvalidMenuOptionException extends Exception {
    public InvalidMenuOptionException(String message) {
        super(message);
    }
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankingSystem {
    private double balance;
    public BankingSystem(double initialBalance) throws InsufficientBalanceException {
        if (initialBalance < 1000) {
            throw new InsufficientBalanceException("Opening balance must be at least 1000.");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. Current balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for this transaction.");
        }
        balance -= amount;
        System.out.println("Amount withdrawn successfully. Current balance: " + balance);
    }
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingSystem account = null;

        try {
            System.out.print("Enter opening balance: ");
            double initialBalance = scanner.nextDouble();
            account = new BankingSystem(initialBalance);

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            account.deposit(depositAmount);
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            account.withdraw(withdrawAmount);
                            break;
                        case 3:
                            account.displayBalance();
                            break;
                        case 4:
                            System.out.println("Thank you for using our banking service!");
                            scanner.close();
                            return;
                        default:
                            throw new InvalidMenuOptionException("Invalid menu option selected. Please try again.");
                    }
                } catch (InvalidMenuOptionException | InsufficientBalanceException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
