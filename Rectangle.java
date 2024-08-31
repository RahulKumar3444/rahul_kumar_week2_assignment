public class Rectangle {
    // Attributes
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor for a square (one parameter)
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor for a rectangle (two parameters)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Overloaded method to calculate the area with parameters (length and width)
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Overloaded method to calculate the perimeter with parameters (length and width)
    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Method to display the dimensions and area/perimeter of the rectangle
    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Using the default constructor
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1 (Default Constructor):");
        rectangle1.displayDetails();

        // Using the constructor with one parameter (square)
        Rectangle rectangle2 = new Rectangle(5.0);
        System.out.println("\nRectangle 2 (Square Constructor):");
        rectangle2.displayDetails();

        // Using the constructor with two parameters (rectangle)
        Rectangle rectangle3 = new Rectangle(4.0, 7.0);
        System.out.println("\nRectangle 3 (Rectangle Constructor):");
        rectangle3.displayDetails();

        // Demonstrating method overloading
        System.out.println("\nUsing Overloaded Methods:");
        System.out.println("Area with parameters (3.0, 6.0): " + rectangle3.calculateArea(3.0, 6.0));
        System.out.println("Perimeter with parameters (3.0, 6.0): " + rectangle3.calculatePerimeter(3.0, 6.0));
    }
}

