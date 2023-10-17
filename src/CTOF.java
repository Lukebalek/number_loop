import java.util.Scanner;

public class CTOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        do {
            System.out.print("Enter a valid number: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        } while (!validInput);

        System.out.println("You entered a valid number: " + number);

        scanner.close();
    }
}
