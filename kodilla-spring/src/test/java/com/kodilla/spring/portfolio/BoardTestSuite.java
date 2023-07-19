package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().getTasks().add("Task to do #1");
        System.out.println(board.getToDoList().getTasks().get(0));
        board.getInProgressList().getTasks().add("Task in progress #1");
        System.out.println(board.getInProgressList().getTasks().get(0));
        board.getDoneList().getTasks().add("Task done #1");
        System.out.println(board.getDoneList().getTasks().get(0));
    }
}