package DoWhileloops;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        System.out.println("do_while loop continue untill user enters value <=0");
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("You entered: " + number);
        scanner.close();
    }
}
