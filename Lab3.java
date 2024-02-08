// Programmers:  Gigi Li and Cynthia Somers
// Course:  CS 212
// Due Date: Sunday, February 11
// Lab Assignment: Lab3
// Problem Statement: create a virtual ATM and allow user to deposit, withdraw, check balance, and exit.
// Data In: name, deposit or withdraw amount, print or email receipt
// Data Out: balance amount, total deposited/withdrew, reminder to get receipt
// Credits: https://stackabuse.com/java-check-if-string-is-a-number/ (typecasting)
// https://stackoverflow.com/questions/9781373/a-try-catch-method-in-while-loop (try-catch method in while loop)

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
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");

        // initialize variables
        double balance = 212.90;
        double totalDeposit = 0;
        double totalWithdrawn = 0;

        // provide options and take user input
        System.out.println("Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
        System.out.println("What would you like to do? Enter a number 1 through 4: ");
        String choice = input.nextLine();

        //error check the user input to make sure it's a number
        while (!choice.matches("[1-4]")) { //typecast string to int
            System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
            System.out.println("What would you like to do? Enter a number 1 through 4: ");
            choice = input.nextLine();
        }
        //typecast the user input to an int after error checking
        int numChoice = (Integer.parseInt(choice)); //typecast string to int

        //error check the user input make sure it's an acceptable option
        while (numChoice < 1 || numChoice > 4){
            System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
            System.out.println("What would you like to do? Enter a number 1 through 4: ");
            numChoice = input.nextInt();
        }

        // create a loop when the user does anything but ask to exit
        while (numChoice != 4){
            // do the following iff they choose 1 deposit
            if (numChoice == 1) {
                // report current balance formatted properly
                System.out.println("Your current balance is " + formatter.format(balance));
                String deposit;
                double numDeposit;

                while (true){
                    System.out.println("How much do you want to deposit?");
                    deposit = input.nextLine();

                    try{
                        numDeposit = Double.parseDouble(deposit);
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("Invalid input. Please enter a valid double.");
                    }
                }

                // error checking deposit amount
                while (numDeposit < 0) {
                    System.out.println("You can't enter a negative amount. Please enter a positive amount: ");
                    numDeposit = input.nextDouble();
                }
                // adding the deposit from this one into the total amount, so we can report at the end
                // also updating what the balance is
                totalDeposit += numDeposit;
                balance += numDeposit;
                System.out.println("Your updated balance is " + formatter.format(balance));

                //goes back to the menu of options
                System.out.println("Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                System.out.println("What would you like to do? Enter a number 1 through 4: ");
                choice = input.nextLine();
                //error checking for number
                while (!choice.matches("[1-4]")) {
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    choice = input.nextLine();
                }
                //typecast the user input to an int after error checking
                numChoice = (Integer.parseInt(choice));
                //error checking options
                while (numChoice < 1 || numChoice > 4){
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    numChoice = input.nextInt();
                }
                //user can exit the menu when they choose 4
                if (numChoice == 4){
                    break;
                }

            }
            if (numChoice == 2) {
                // report balance, ask for input, store as a double
                System.out.println("Your current balance is " + formatter.format(balance));
                String withdraw;
                double numWithdrawn;

                while (true){
                    System.out.println("How much do you want to withdraw?");
                    withdraw = input.nextLine();

                    try{
                        numWithdrawn = Double.parseDouble(withdraw);
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("Invalid input. Please enter a valid double.");
                    }
                }
                //error check
                while (numWithdrawn < 0) {
                    System.out.println("You can't enter a negative amount. Please enter a positive amount: ");
                    numWithdrawn = input.nextDouble();
                }
                // update total withdraw amount and balance account
                totalWithdrawn += numWithdrawn;
                balance -= numWithdrawn;
                System.out.println("Your updated balance is " + formatter.format(balance));

                //goes back to the menu of options
                System.out.println("Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                System.out.println("What would you like to do? Enter a number 1 through 4: ");
                choice = input.nextLine();
                //error checking for number
                while (!choice.matches("[1-4]")) {
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    choice = input.nextLine();
                }
                //typecast the user input to an int after error checking
                numChoice = (Integer.parseInt(choice));
                //error checking options
                while (numChoice < 1 || numChoice > 4){
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    numChoice = input.nextInt();

                }
                //user can exit the menu when they choose 4
                if (numChoice == 4){
                    break;
                }

            }
            if (numChoice == 3) {
                // report current balance properly formatted
                System.out.println("Your current balance is " + formatter.format(balance));

                //goes back to the menu of options
                System.out.println("Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                System.out.println("What would you like to do? Enter a number 1 through 4: ");
                choice = input.nextLine();
                //error checking for number
                while (!choice.matches("[1-4]")) {
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    choice = input.nextLine();
                }
                //typecast the user input to an int after error checking
                numChoice = (Integer.parseInt(choice));
                //error checking options
                while (numChoice < 1 || numChoice > 4){
                    System.out.println("Error in input. Here are your options: Deposit - 1, Withdraw - 2, Check Balance - 3, and Exit - 4");
                    System.out.println("What would you like to do? Enter a number 1 through 4: ");
                    numChoice = input.nextInt();
                }
                //user can exit the menu when they choose 4
                if (numChoice == 4){
                    break;
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

        System.out.println("Thank you " + name + " for using our ATM!");


    }
}
