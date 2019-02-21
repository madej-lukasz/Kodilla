package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task doTheTask(final String task){
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("Shopping list", "Bread", 2);
            case PAINTING:
                return new PaintingTask("Paint the wall", "Blue", "All room");
            case DRIVING:
                return new DrivingTask("Tesco","Centre","Car" );
                default:
                    return null;
        }
    }
}
