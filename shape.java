// Parent class
class Shape {
    // Common parent class for geometric shapes
}

// Cube subclass implementing encapsulation
class Cube extends Shape {
    private double side;

    // Constructor using the 'this' keyword
    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getVolume() {
        return this.side * this.side * this.side;
    }
}

// Cuboid subclass implementing encapsulation
class Cuboid extends Shape {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return this.length * this.width * this.height;
    }
}

// Cylinder subclass implementing encapsulation
class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating objects for each shape
        Cube myCube = new Cube(4.0);
        Cuboid myCuboid = new Cuboid(3.0, 4.0, 5.0);
        Cylinder myCylinder = new Cylinder(3.0, 7.0);

        // Displaying the calculated volumes
        System.out.println("--- Volume Calculator ---");
        System.out.println("Volume of the Cube: " + myCube.getVolume());
        System.out.println("Volume of the Cuboid: " + myCuboid.getVolume());
        System.out.println("Volume of the Cylinder: " + myCylinder.getVolume());
    }
}
