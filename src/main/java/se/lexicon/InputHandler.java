package se.lexicon;

import java.util.Scanner;


public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public int getMenuChoice() {
        int choice;
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 0 and 4.");
                scanner.next();
            }
        }
        return choice;
    }
    public double getValidAmount(String prompt) {
        double amount;
        while (true) {
            try {
                System.out.print(prompt);
                amount = scanner.nextDouble();
                if (amount < 0) {
                    System.out.println("Amount cannot be negative. Enter again: ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a numeric value.");
                scanner.next();
            }
        }
        return amount; }
    public void closeScanner() {
        scanner.close();
    }

}
