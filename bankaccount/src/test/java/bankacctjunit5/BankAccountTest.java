package bankacctjunit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("BankAcciunt Testing")

public class BankAccountTest {

    @Test
    @DisplayName("Testing amountInAccount method to see if it returns current balance")
    public void amountInAccount() {
        BankAccount acctholder = new BankAccount ("Paul Bloomberg");
        BankAccount acctholder2 = new BankAccount ("Paul Bloomberg");

        assertEquals(0, acctholder.getAccountBalance());
        assertEquals(10.0, acctholder2.deposit(10));
    }

    @Test
    @DisplayName("Testing the withdrawl method by subtracting an amount and return new balance")
     public void withdrawal() {
        BankAccount acct = new BankAccount("Peter Pan", 500.0);
        assertEquals(400, acct.withdrawl(100));
    }

    @Test
    @DisplayName("Testing the deposit method by adding an amount and return new balance")
     public void deposit() {
        BankAccount acct = new BankAccount("Peter Pan", 500.0);
        assertEquals(600, acct.deposit(100));
    }
}