package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isTaskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isTaskExecuted = false;
    }

    public void executeTask(){
        System.out.println("Executing shopping task: " + taskName);
        System.out.println("Buying " + whatToBuy + " in quantity of: " + quantity);
        isTaskExecuted = true;
    }

    public String getTaskName(){
        return taskName;
    }

    public boolean isTaskExecuted(){
        return isTaskExecuted;
    }
}
