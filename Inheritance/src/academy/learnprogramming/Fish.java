package academy.learnprogramming;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        // Provided default values so removed brain and body from parameter list
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {

    }

    public void moveMuscles() {

    }

    public void moveBackFin() {

    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }

}
