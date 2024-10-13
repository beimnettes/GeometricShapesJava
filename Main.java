public class Main {
    public static void main(String[] args) {
        // Create instances of Circle, Rectangle, and Triangle
        Shape circle = new Circle(5); // Circle with radius 5
        Shape rectangle = new Rectangle(4, 6); // Rectangle with length 4 and width 6
        Shape triangle = new Triangle(3, 4, 5); // Triangle with sides 3, 4, 5

        // Print details for each shape
        printShapeDetails(circle);
        printShapeDetails(rectangle);
        printShapeDetails(triangle);

        // Edge cases
        Shape zeroCircle = new Circle(0); // Circle with radius 0
        Shape flatRectangle = new Rectangle(0, 5); // Rectangle with length 0
        Shape invalidTriangle = new Triangle(1, 2, 10); // Invalid triangle

        System.out.println("Edge Cases:");
        printShapeDetails(zeroCircle);
        printShapeDetails(flatRectangle);
        printShapeDetails(invalidTriangle);
    }

    // Method to print the details of each shape
    public static void printShapeDetails(Shape shape) {
        System.out.println("Shape: " + shape.getName());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}
