public class InstatiatingObjects {
    class Rectangle {
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
