package Classes;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Create method to update the model.
    public void setModel(String model) {
        // Use "this" when referring to field of the class.
        // this.model = model;
        String validModel = model.toLowerCase();
        if (validModel.equals("civic") || validModel.equals("tundra")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // Create the getter
    public String getModel() {
        return this.model;
    }
}
