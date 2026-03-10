import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Account account0 = new Account("123456789", 1234, 1000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Please enter your PIN:");
        int enteredPin = scanner.nextInt();

        if (enteredPin == account0.getPin()){
            System.out.println("Login successful!");
            boolean isFinished = false;
            while (!isFinished){
                System.out.println("1. View Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        System.out.println("Balance: " + account0.getBalance());
                        break;
                    case 2:
                        System.out.println("How much do you want to deposit?");
                        double depositAmount = scanner.nextDouble();
                        account0.deposit(depositAmount);
                        System.out.println("Your new account balance is: " + account0.getBalance());
                        break;

                    case 3:
                        System.out.println("How much do you want to withdraw?");
                        double withdrawAmount = scanner.nextDouble();
                        account0.withdraw(withdrawAmount);

                        if (withdrawAmount > account0.getBalance()){
                            System.out.println("Unsufficient funds.");
                        } else {
                            System.out.println("Please take your money.");
                            System.out.println("Remaining balance: " + account0.getBalance());

                            isFinished = true;
                        }
                        break;
                    case 4:
                        System.out.println("Logging out...");
                        isFinished = true;
                        break;

                    default:
                        System.out.println("Invalid option. Please enter a valid number.");
                }
            }
        } else {
            System.out.println("Wrong PIN.");

        }
    }
}
