package com.company;

import java.util.*;

class ExtendingClasses_RealWorld {
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

    class Triangle extends GeometricObject {
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
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ExtendingClasses_RealWorld program = new ExtendingClasses_RealWorld();

        double[] triangleArray = new double[3];
        double side1 = 0.0;
        double side2 = 0.0;
        double side3 = 0.0;
        boolean filling = false;

        System.out.print("Enter three sides of a triangle, a color, and whether it is filled: ");
        for (int loop = 0; loop < 3; loop++) {
            triangleArray[loop] = input.nextDouble();
        }
        String userStr = input.nextLine();
        userStr = userStr.toLowerCase();
        if (userStr.contains("true")) {
            userStr = userStr.replace("true", "");
            filling = true;
        } else if (userStr.contains("false")) {
            userStr = userStr.replace("false", "");
            filling = false;
        }
        userStr = userStr.replace(" ", "");
        side1 = triangleArray[0];
        side2 = triangleArray[1];
        side3 = triangleArray[2];

        ExtendingClasses_RealWorld.Triangle tri1 = program.new Triangle(side1, side2, side3);
        tri1.setColor(userStr);
        tri1.setFilled(filling);
        System.out.printf("Triangle: \nArea: %.2f\tPerimeter : %.2f\nDate Created: %s\nColor: %s\tFilled: %s", tri1.getArea(),
                tri1.getPerimeter(), tri1.getDateCreated(), tri1.getColor(), tri1.isFilled());
    }
}
