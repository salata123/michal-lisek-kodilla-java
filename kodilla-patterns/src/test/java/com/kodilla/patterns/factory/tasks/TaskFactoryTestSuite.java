package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreatingTasks(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.createTask("SHOPPING");
        Task drivingTask = taskFactory.createTask("DRIVING");
        Task paintingTask = taskFactory.createTask("PAINTING");

        String expectedShoppingTaskName = "Groceries";
        String expectedDrivingTaskName = "Gas Station";
        String expectedPaintingTaskName = "House";

        //When
        shoppingTask.executeTask();
        drivingTask.executeTask();
        paintingTask.executeTask();

        //Then
        Assertions.assertEquals(expectedShoppingTaskName, shoppingTask.getTaskName());
        Assertions.assertEquals(expectedDrivingTaskName, drivingTask.getTaskName());
        Assertions.assertEquals(expectedPaintingTaskName, paintingTask.getTaskName());
        Assertions.assertTrue(shoppingTask.isTaskExecuted());
        Assertions.assertTrue(drivingTask.isTaskExecuted());
        Assertions.assertTrue(paintingTask.isTaskExecuted());
    }
}
