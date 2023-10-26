public class InstantiatingObjects_RealWorld {
    public static void main(String[] args) {
        Rectangle first = new Rectangle();
        Rectangle second = new Rectangle();
        first.setDimension(4.0,40.0);
        second.setDimension(3.5,35.9);

        System.out.println("First Rectangle:");
        System.out.println("Width: " + first.width + " Height: " + first.height);
        System.out.printf("Area: %.1f Perimeter: %.1f\n\n", first.getArea(), first.getPerimeter());
        System.out.println("Second Rectangle:");
        System.out.println("Width: " + second.width + " Height: " + second.height);
        System.out.printf("Area: %.1f Perimeter: %.1f", second.getArea(), second.getPerimeter());
    }
    static class Rectangle {
        double width;
        double height;

        Rectangle() {
            width = 1.0;
            height = 1.0;
        }
        void setDimension(double initialWidth, double initialHeight) {
            width = initialWidth;
            height = initialHeight;
        }
        double getArea() {
            return width * height;
        }
        double getPerimeter() {
            return (width + height) * 2;
        }
    }
}
