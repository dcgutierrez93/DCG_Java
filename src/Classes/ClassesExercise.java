package Classes;

public class ClassesExercise {
    public static void main(String[] args) {
        // Creating the object
        Car honda = new Car();
        Car toyota = new Car();

        // Call the set.model from car.
        honda.setModel("Civic");
        System.out.println("Model is " + honda.getModel());

        honda.setModel("Accord");
        System.out.println("Model is " + honda.getModel());
    }
}
