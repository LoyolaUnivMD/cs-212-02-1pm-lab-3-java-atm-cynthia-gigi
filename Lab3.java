// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: none

import java.util.Scanner;
import java.text.DecimalFormat;

class Lab3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Lab 3");

        System.out.println("What is your name?");
        String name = input.nextLine();

        DecimalFormat formatter = new DecimalFormat("###,###,###.##");

        double balance = 212.90;
        double totalDeposit = 0;
        double totalWithdrawn = 0;

        input.nextLine(); //debugs the error with the code skipping lines for the 2nd string input

        System.out.println("Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
        System.out.println("What would you like to do? Enter a number 1 through 4: ");
        int choice = input.nextInt();
        while (choice < 1 || choice > 4){
            System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
            System.out.println("What would you like to do? Enter a number 1 through 4: ");
            choice = input.nextInt();
        }
        while (choice != 4){
            if (choice == 1) {
                System.out.println("Your current balance is " + formatter.format(balance));
                System.out.println("How much do you want to deposit?");
                double deposit = input.nextDouble();
                while (deposit < 0) {
                    System.out.println("You can't enter a negative amount. Please enter a positive amount: ");
                    deposit = input.nextDouble();
                }
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
                System.out.println("Your current balance is " + formatter.format(balance));
                System.out.println("How much do you want to withdraw?");
                double withdraw = input.nextDouble();
                while (withdraw < 0) {
                    System.out.println("You can't enter a negative amount. Please enter a positive amount: ");
                    withdraw = input.nextDouble();
                }
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
                System.out.println("Your current balance is " + formatter.format(balance));
                choice = input.nextInt();
                while (choice < 1 || choice > 4) {
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    choice = input.nextInt();
                }
            }
        }


        System.out.println("Would you like a printed or emailed receipt?");
        String receipt = input.nextLine().toLowerCase().strip();
        while (!receipt.equals("printed") && !receipt.equals("print") && !receipt.equals("emailed") && !receipt.equals("email")){
            System.out.println("You have entered an invalid input. Would you like a printed or emailed receipt?");
            receipt = input.nextLine().toLowerCase().strip();
        }

        System.out.println("You deposited $" + formatter.format(totalDeposit) + " in total.");
        System.out.println("You withdrew $" + formatter.format(totalWithdrawn) + " in total.");

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