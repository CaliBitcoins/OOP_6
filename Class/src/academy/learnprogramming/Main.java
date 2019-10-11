package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Created an Object called "porsche" based on Car template
        // must initialize value - new instance must be initialized
        Car porsche = new Car();
        Car lambo = new Car();

        porsche.setModel("Carrera");

        // reference instance of Car class and call getModel method
        System.out.println(porsche.getModel());
    }
}
