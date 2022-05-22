package bankacctjunit5;

/*Create a class called "BankAccount" that has two attributes - a bank account balance and an account holder's name. 
  Create a constructor that can accept both attributes as the parameters. */

  public class BankAccount {
      String accountHolder;
     private double accountBalance;
        
// Constructor
        public BankAccount(String accountHolderName) {
            this.accountHolder = accountHolderName;
            this.accountBalance = 0.00; 
        
        }

        public BankAccount(String accountHolderName, double accountBalance) {
            this.accountHolder = accountHolderName;
            this.accountBalance = accountBalance; 
        
        }
//Sets bank account balance
        public void amountInAccount( double accountAmount) {
            this.accountBalance = accountAmount;

        }


        public double getAccountBalance() {
            return accountBalance;
        }

      

        // A deposit() method that has an amount of money to deposit as the parameter. Add that amount to the account balance.
        public double deposit(double amountToDeposit) {
            return this.accountBalance + amountToDeposit;

        }

// A withdrawal() method that has an amount of money to withdraw as the parameter. Subtract that amount from the account balance.
        public double withdrawl(double amountToWithdraw) {
            return this.accountBalance - amountToWithdraw;

        }

// A method that can print the account details to the console, account holder's name and balanc
        public void accountDetails() {
            System.out.println("This account belongs to " + this.accountHolder + " and the balance is " + this.accountBalance);

        }
}
    

