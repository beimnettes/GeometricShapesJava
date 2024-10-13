abstract class Shape {
    // Abstract methods for calculating area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Concrete method to get the name of the shape
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
