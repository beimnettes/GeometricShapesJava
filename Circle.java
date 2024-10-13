public class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the abstract method to calculate the area
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Implement the abstract method to calculate the perimeter
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
    
