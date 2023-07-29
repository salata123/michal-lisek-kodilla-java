package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task createTask(final String taskType) {
        return switch (taskType) {
            case SHOPPING -> new ShoppingTask("Groceries", "Milk", 2);
            case DRIVING -> new DrivingTask("Gas Station", "nearest gas station", "Car");
            case PAINTING -> new PaintingTask("House", "red", "Fence");
            default -> null;
        };
    }
}
