public class Rectangle extends Shape {
    private double length, width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the abstract method to calculate the area
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implement the abstract method to calculate the perimeter
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
