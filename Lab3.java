// Programmers:  Gigi and Cynthia
// Course:  CS 212
// Due Date: Sunday 11
// Lab Assignment: Lab3
// Problem Statement: create a virtual ATM and allow user to deposit, withdraw, check balance etc
// Data In: name, deposit or withdraw amount, print or email receipt
// Data Out: balance amount
// Credits: none

// import scanner and formatting
import java.util.Scanner;
import java.text.DecimalFormat;

class Lab3 {
    public static void main(String[] args) {

        // declare scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Lab 3");

        // ask name
        System.out.println("What is your name?");
        String name = input.nextLine();

        // declare decimal formatting
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");

        // initialize variables
        double balance = 212.90;
        double totalDeposit = 0;
        double totalWithdrawn = 0;

        // provide options, input as an int
        System.out.println("Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
        System.out.println("What would you like to do? Enter a number 1 through 4: ");
        int choice = input.nextInt();

        //error check the user input make sure its an acceptable option
        while (choice < 1 || choice > 4){
            System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
            System.out.println("What would you like to do? Enter a number 1 through 4: ");
            choice = input.nextInt();
        }

        // create a loop when the user does anything but ask to exit
        while (choice != 4){
            // do the following iff they choose 1 deposit
            if (choice == 1) {
                // report current balance formatted properly
                System.out.println("Your current balance is " + formatter.format(balance));
                System.out.println("How much do you want to deposit?");
                // ask for deposit amount, store as a double
                double deposit = input.nextDouble();
                // error checking deposit amount
                while (deposit < 0) {
                    System.out.println("You can't enter a negative amount. Please enter a positive amount: ");
                    deposit = input.nextDouble();
                }
                // adding the deposit from this one into the total amount so we can report at the end
                // also updating what the balance is
                totalDeposit += deposit;
                balance += deposit;
                System.out.println("Your updated balance is " + formatter.format(balance));
                choice = input.nextInt();
                while (choice < 1 || choice > 4) {
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    choice = input.nextInt();
                }
            }
            if (choice == 2) {
                // report balance, ask for input, store as a double
                System.out.println("Your current balance is " + formatter.format(balance));
                System.out.println("How much do you want to withdraw?");
                double withdraw = input.nextDouble();
                //error check
                while (withdraw < 0) {
                    System.out.println("You can't enter a negative amount. Please enter a positive amount: ");
                    withdraw = input.nextDouble();
                }
                // update total withdraw amount and balance account
                totalWithdrawn += withdraw;
                balance -= withdraw;
                System.out.println("Your updated balance is " + formatter.format(balance));
                choice = input.nextInt();
                while (choice < 1 || choice > 4) {
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    choice = input.nextInt();
                }
            }
            if (choice == 3) {
                // report current balance properly formatted
                System.out.println("Your current balance is " + formatter.format(balance));
                choice = input.nextInt();
                while (choice < 1 || choice > 4) {
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    choice = input.nextInt();
                }
            }
        }

        // closing remarks, ask for receipt type and store as a string, lower, strip
        System.out.println("Would you like a printed or emailed receipt?");
        String receipt = input.nextLine().toLowerCase().strip();
        //error check
        while (!receipt.equals("printed") && !receipt.equals("print") && !receipt.equals("emailed") && !receipt.equals("email")){
            System.out.println("You have entered an invalid input. Would you like a printed or emailed receipt?");
            receipt = input.nextLine().toLowerCase().strip();
        }

        //printing out deposit or withdrawal totals
        System.out.println("You deposited $" + formatter.format(totalDeposit) + " in total.");
        System.out.println("You withdrew $" + formatter.format(totalWithdrawn) + " in total.");

        // telling user to remember to get their receipt
        if (receipt.equals("printed")) {
            System.out.println("Remember to get your receipt.");
        }
        if (receipt.equals("print")){
            System.out.println("Remember to get your receipt.");
        }
        if (receipt.equals("emailed")) {
            System.out.println("Remember to check your email for your receipt.");
        }
        if (receipt.equals("email")){
            System.out.println("Remember to check your email for your receipt.");
        }




        System.out.println("Thank you" + name + "for using our ATM!");


    }
}
