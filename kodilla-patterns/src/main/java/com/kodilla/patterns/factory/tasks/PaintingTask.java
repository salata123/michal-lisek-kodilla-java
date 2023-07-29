package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.taskExecuted = false;
    }

    @Override
    public void executeTask() {
        // Kod realizujący zadanie, np. malowanie obiektu
        System.out.println("Executing painting task: " + taskName);
        System.out.println("Painting " + whatToPaint + " with color " + color);
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
