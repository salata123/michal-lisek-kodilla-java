package com.kodilla.patterns2.observer.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTopicTestSuite {
    @Test
    public void testUpdate() {
        // Given
        TaskQueue taskQueue1 = new TaskQueue("John");
        TaskQueue taskQueue2 = new TaskQueue("Eva");
        TaskQueue taskQueue3 = new TaskQueue("Patricia");

        Mentor mentor1 = new Mentor("Adam");
        Mentor mentor2 = new Mentor("Patrick");
        Mentor mentor3 = new Mentor("Bob");

        taskQueue1.registerObserver(mentor1);
        taskQueue2.registerObserver(mentor2);
        taskQueue3.registerObserver(mentor3);
        taskQueue2.registerObserver(mentor3);

        // When
        taskQueue1.addTask("Task #1");
        taskQueue1.addTask("Task #2");
        taskQueue1.addTask("Task #3");
        taskQueue1.addTask("Task #4");
        taskQueue2.addTask("Task #1");
        taskQueue2.addTask("Task #2");
        taskQueue2.addTask("Task #3");
        taskQueue2.addTask("Task #4");
        taskQueue3.addTask("Task #1");
        taskQueue3.addTask("Task #2");
        taskQueue3.addTask("Task #3");
        taskQueue3.addTask("Task #4");


        // Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(4, mentor2.getUpdateCount());
        assertEquals(8, mentor3.getUpdateCount());
    }
}
