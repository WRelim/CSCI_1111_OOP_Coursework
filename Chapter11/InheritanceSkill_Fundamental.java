package com.company;

public class InheritanceSkill_Fundamental {
    public class GeometricObject {
        private String color = "white";
        private boolean filled;
        private java.util.Date dateCreated;

        public GeometricObject() {
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

        public boolean isFilled() {
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

        public class Triangle extends GeometricObject {
            double side1;
            double side2;
            double side3;

            public Triangle() {
                side1 = 1.0;
                side2 = 1.0;
                side3 = 1.0;
            }

            public Triangle(double side1, double side2, double side3) {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
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
                double s = (2 / (side1 + side2 + side3));
                return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
            }

            double getPerimeter() {
                return side1 + side2 + side3;
            }
        }
    }
}
