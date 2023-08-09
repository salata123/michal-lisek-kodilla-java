package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Home tasks";
    private static final String DESCRIPTION = "Tasks to do around the house";
    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, LISTNAME);

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> readTask = taskListDao.findByListName(LISTNAME);
        assertEquals(1, readTask.size());

        //CleanUp
        int id = readTask.get(0).getId();
        taskListDao.deleteById(id);
    }
}
