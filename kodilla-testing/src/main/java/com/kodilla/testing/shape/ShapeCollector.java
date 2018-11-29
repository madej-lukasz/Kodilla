package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> square = new ArrayList<Shape>();
        public void addFigure(Shape shape) {
            square.add(shape);
        }
        public void removeFigure(Shape shape){
            square.remove(shape);
        }
        public Shape getFigure(int n){
            return square.get(n);
        }
        public int getShowFigures(){
            return square.size();
        }
}
