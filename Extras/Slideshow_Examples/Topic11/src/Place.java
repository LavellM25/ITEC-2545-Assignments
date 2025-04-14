public class Place {

    // These are the two constant variables that will be reference later in the project.
    private String name;
    private double elevation;

    // Create a constructor that passes in the two args that are the constant variables.
    public Place(String name, double elevation) {
        this.name = name;
        this.elevation = elevation;
    }

    // Create a getter method for the name variable
    public String getName() {
        return name;
    }

    // Create a setter method for the name variable
    public void setName(String name) {
        this.name = name;
    }

    // Method for getter for the elevation variable
    public double getElevation() {
        return elevation;
    }

    // Method for setter for the elevation variable
    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    // Write an override method for the toString() method.
    @Override
    public String toString() {
        return "Place: " + name + " is at elevation " + elevation + " meters";
    }
}
