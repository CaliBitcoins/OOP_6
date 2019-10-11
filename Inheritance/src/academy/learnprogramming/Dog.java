package academy.learnprogramming;

// Dog is an Animal and can inherit its characteristics

public class Dog extends Animal {
    // Field values characteristic to Dogs
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Dog Constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // Initialize the base characteristics of an Animal using super keyword to reference super class
        // provided default value of 1 for brain and body and removed these parameters from constructor
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // Overrides the base animal class Animal.eat()
    // use Generate to create override methods quickly
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); // Calls eat() method from Animal super class
    }


}
