package com.company;
import java.util.*;

public class InheritanceSkill_RealWorld {
    public static class GeometricObject {
        private String color;
        private boolean filled;
        private java.util.Date dateCreated;

        public GeometricObject() {
            color = "white";
            filled = false;
            dateCreated = new java.util.Date();
        }

        public GeometricObject(String color, boolean filled) {
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

        public boolean getFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        public String toString() {
            return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
        }

    }
    public static class Triangle extends GeometricObject {
        double side1;
        double side2;
        double side3;
        String dateCreated;
        java.util.Date date = new java.util.Date();


        public Triangle() {
            side1 = 1.0;
            side2 = 1.0;
            side3 = 1.0;
            this.dateCreated = date.toString();
        }

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.dateCreated = date.toString();
        }

        double getSide1() {
            return side1;
        }

        double getSide2() {
            return side2;
        }

        double getSide3() {
            return side3;
        }

        double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
        }

        double getPerimeter() {
            return side1 + side2 + side3;
        }
        @Override
        public String toString() {
            return "Triangle: Side1 = " + side1 + " Side2 = " + side2 + " Side3 = " + side3;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1 = 0.0;
        double side2 = 0.0;
        double side3 = 0.0;
        GeometricObject geometricObject = new GeometricObject();


        int[] userArray = new int[3];
        boolean filling = false;
        System.out.println("Enter three sides of a triangle, a color, and a Boolean value to indicate whether the triangle is filled.");
        for (int loop = 0; loop < 3; loop++) {
            userArray[loop] = input.nextInt();
        }
        side1 = userArray[0];
        side2 = userArray[1];
        side3 = userArray[2];

        String userStr = input.nextLine();
        userStr.toLowerCase();
        if (userStr.contains("true")) {
            userStr = userStr.replace("true", "");
            filling = true;
        }
        else if (userStr.contains("false")) {
            userStr = userStr.replace("false", "");
            filling = false;
        }
        userStr = userStr.replace(" ", "");

        Triangle tri1 = new Triangle(side1, side2, side3);
        tri1.setColor(userStr);
        tri1.setFilled(filling);

        System.out.printf("Triangle: \nArea: %.2f\tPerimeter : %.2f\nDate Created: %s\tFilled: %s", tri1.getArea(), tri1.getPerimeter(), tri1.getDateCreated(), tri1.getFilled());
    }
}
