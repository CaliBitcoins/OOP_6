package academy.learnprogramming;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // CONSTRUCTOR EXAMPLE - no return type
    public BankAccount() {
        // if empty constructor called create default values by calling 2nd constructor using this
        this("1234567", 20000.00, "Jake McManus", "jake@legend.email", "520-343-3876");
        System.out.println("Empty constructor called");
    }

    // OVERLOADED CONSTRUCTOR - No return type
    // Do not call setters or other methods from constructor - RULE OF THUMB
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("Your current balance is: $" + this.balance);
    }

    public void withdraw(double withdraw) {
        double result = this.balance - withdraw;
        if (result >= 0) {
            this.balance -= withdraw;
            System.out.println("Your current balance is: $" + this.balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
