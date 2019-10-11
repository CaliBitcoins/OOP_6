package academy.learnprogramming;

public class Car {

    // Class Variables AKA "Fields"
    // private access modifier prevents visibility beyond this class
    // private is used to maintain principles of encapsulation
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setModel(String model) {
        // To access field values use keyword "this"
        // update field value model with parameter model value
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("coontosh")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // getter method returns field values to calls made outside this class
    public String getModel() {
        return this.model;
    }
}
