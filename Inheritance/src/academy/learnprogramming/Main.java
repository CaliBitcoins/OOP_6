package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 28, 2, 4, 1, 20, "Long silky");

        // See that Animal method eat() is inherited by Dog class
        // eat method defined in Animal Class but accessible by dog instance
        dog.eat();
    }
}
