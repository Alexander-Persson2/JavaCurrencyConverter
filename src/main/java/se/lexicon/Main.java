package se.lexicon;

public class Main {
 public static void main(String[] args) {
     InputHandler inputHandler = new InputHandler();
     int choice;
     do {
         displayMenu();
         choice = inputHandler.getMenuChoice();
         handleChoice(choice, inputHandler);
     }
     while (choice != 0);
     inputHandler.closeScanner();
 }

 public static void displayMenu() {
     System.out.println("Currency Converter Menu");
     System.out.println("1. Convert SEK to USD");
     System.out.println("2. Convert USD to SEK");
     System.out.println("3. Convert SEK to Euro");
     System.out.println("4. Convert Euro to SEK");
     System.out.println("0. Exit");
 }

 public static void handleChoice(int choice, InputHandler inputHandler) {
     double amount;
     switch (choice) {
         case 1:
             amount = inputHandler.getValidAmount("Enter amount in SEK: ");
             System.out.println(Converter.convertSEKToUSD(amount));
             break;

         case 2:
             amount = inputHandler.getValidAmount("Enter amount in USD: ");
             System.out.println(Converter.convertUSDToSEK(amount));
             break;

         case 3:
             amount = inputHandler.getValidAmount("Enter amount in SEK: ");
             System.out.println(Converter.convertSEKToEuro(amount));
             break;

         case 4:
             amount = inputHandler.getValidAmount("Enter amount in Euro: ");
             System.out.println(Converter.convertEuroToSEK(amount));
             break;

         case 0:
             System.out.println("Exiting Converter App");
             break;

         default:
             System.out.println("Invalid choice. Please try again.");
             break;
     }
 }
}
