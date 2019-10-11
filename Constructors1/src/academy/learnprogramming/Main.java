package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        BankAccount swiss = new BankAccount();

        //Create new instance of BankAccount using constructor
        //BankAccount swiss = new BankAccount("123456", 10000.00, "test", "test", "test");
        swiss.deposit(500000000);
        swiss.withdraw(2000000000);


    }
}
