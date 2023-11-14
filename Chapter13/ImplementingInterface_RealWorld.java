package com.company;

import java.util.*;

class ImplementingInterface_RealWorld {
    abstract class GeometricObject {
        String color = "white";
        boolean filled = false;
        private java.util.Date dateCreated;

        protected GeometricObject() {
            dateCreated = new java.util.Date();
        }
        protected GeometricObject(String color, boolean filled) {
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public boolean isFilled() {
            return filled;
        }
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        public java.util.Date getDateCreated() {
            return dateCreated;
        }
        @Override
        public String toString() {
            return "Color: " + color + " Filled: " + filled;
        }
        public abstract double getArea();
        public abstract double getPerimeter();
    }

    class Triangle extends GeometricObject implements Colorable{
        double side1;
        double side2;
        double side3;

        Triangle() {
            this.side1 = 1.0;
            this.side2 = 1.0;
            this.side3 = 1.0;
        }
        Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        public double getSide1() {
            return side1;
        }
        public void setSide1(double side) {
            this.side1 = side;
        }
        public double getSide2() {
            return side2;
        }
        public void setSide2(double side) {
            this.side2 = side;
        }
        public double getSide3() {
            return side3;
        }
        public void setSide3(double side) {
            this.side3 = side;
        }
        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        public double getPerimeter() {
            return side1 + side2 + side3;
        }
        @Override
        public String toString() {
            return " Triangle: Side1: " + side1 + " Side2: " + side2 + " Side3: " + side3;
        }

        @Override
        public void howToColor() {
            System.out.println("Color all three sides. ");
        }
    }

    public interface Colorable {
        void howToColor();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ImplementingInterface_RealWorld program = new ImplementingInterface_RealWorld();
        Triangle[] elements = {
                program.new Triangle(4.0, 5.0, 6.0),
                program.new Triangle(5.0, 6.0, 7.0),
                program.new Triangle(6.0, 7.0, 8.0),
                program.new Triangle(7.0, 8.0, 9.0),
                program.new Triangle(8.0, 9.0, 10.0)};
        for (int loop = 0; loop < elements.length; loop++) {
            System.out.printf("Triangle %d: Area: %.2f\nHow to color: ", loop + 1, elements[loop].getArea());
            elements[loop].howToColor();
        }
    }
}
