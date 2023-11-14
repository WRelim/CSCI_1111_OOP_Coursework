package com.company;
import java.lang.*;
import java.lang.Cloneable;
import java.util.*;

class Exercise13_11 {
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

    class Octagon extends GeometricObject implements Comparable<Octagon> {
        double side;

        Octagon() {
            this.side = 1.0;
        }
        Octagon(double side) {
            this.side = side;
        }
        public double getSide() {
            return side;
        }
        public void setSide(double side) {
            this.side = side;
        }
        public double getArea() {
            return 2 * (1 + Math.sqrt(2)) * (side * side);
        }
        public double getPerimeter() {
            return side * 8;
        }
        @Override
        public String toString() {
            return " Octagon: Side: " + side + " Area: " + getArea() + " Perimeter: " + getPerimeter();
        }

        @Override
        public int compareTo(Octagon o) {
            if (getArea() > o.getArea())
                return 1;
            else if (getArea() < o.getArea())
                return -1;
            else
                return 0;
        }
    }

    public interface Cloneable {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise13_11 program = new Exercise13_11();
        Octagon oct1 = program.new Octagon(2.0);
        Octagon oct2  = oct1;
        System.out.println(oct1.compareTo(oct2));
    }
}
