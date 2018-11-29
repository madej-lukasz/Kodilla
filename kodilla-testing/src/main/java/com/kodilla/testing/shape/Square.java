package com.kodilla.testing.shape;

public class Square implements Shape {
        private double sideA;
        private double sideB;

        public Square(double sideA, double sideB){
            this.sideA = sideA;
            this.sideB = sideB;

        }
        @Override
        public String getShapeName() {
            return "square";
        }

        @Override
        public double getField() {
            return Math.pow(sideA, sideB);
        }
    }

