package bankacctjunit5;

public class Main {
    public static void main(String[] args)  {

/*Create a class with a main method where you instantiate a BankAccount object with 500 dollars. 
 Deposit 100 dollars into the account and then print the account details to the console.*/

        BankAccount accountHolder1 = new BankAccount ("Paul"); //Creates account with name Paul

        accountHolder1.amountInAccount(500.00); //Makes the account balance 500

        accountHolder1.accountDetails();//Prints full account details

        double balanceAfterDeposit = accountHolder1.deposit(100.00); //deposits 100 into account. equal to variable b/c method has return type
        
        System.out.println("My Account Balance: " + balanceAfterDeposit); //Gives the output matching assignment

/*Using the same classes you created in the last lesson, create two accounts. Create the first account with 5000 dollars and the second account with 300 dollars. 
Withdraw 100 dollars from the first account and deposit 100 dollars in the second account using the methods created in the BankAccount class. */

        BankAccount accountHolder2 = new BankAccount ("Larry"); //Creates new account for Larry
        accountHolder2.amountInAccount(5000.00); //Makes the account balance 5000
        accountHolder2.accountDetails(); //Prints account details
        double larrysMoney = 100.00;
        double balanceAfterWithdraw = accountHolder2.withdrawl(larrysMoney); //Withdraws 100 from Larry's account



        BankAccount accountHolder3 = new BankAccount ("Mary"); // Creates new account for Mary
        accountHolder3.amountInAccount(300.00); //Makes the account balance 300
        accountHolder3.accountDetails(); //Prints account  details 
        double balanceAfterTheDeposit = accountHolder3.deposit(larrysMoney); //Deposits 100 to Mary's account


        System.out.println(accountHolder2.accountHolder + "'s account balance: " + balanceAfterWithdraw); // Prints output matching assignment output
        System.out.println(accountHolder3.accountHolder + "'s account balance: " + balanceAfterTheDeposit);// Prints output matching assignment output


    }
}
