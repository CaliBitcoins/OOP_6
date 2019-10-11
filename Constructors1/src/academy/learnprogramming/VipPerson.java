package academy.learnprogramming;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String email;

    // USE IntelliJ to GENERATE Constructors, Getters, and Setters... Left click and select Generate from menu
    public VipPerson() {
        this("Unknown", 0.00, "unknown@legend.email");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@legend.email");
    }

    public VipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
