public class Triangle extends Shape {
    private double sideA, sideB, sideC;

    // Constructor for Triangle
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Implement the abstract method to calculate the area using Heron's formula
    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Implement the abstract method to calculate the perimeter
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
