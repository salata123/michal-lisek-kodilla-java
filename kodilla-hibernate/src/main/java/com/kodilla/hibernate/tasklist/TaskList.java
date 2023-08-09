package com.kodilla.hibernate.tasklist;


import com.kodilla.hibernate.task.Task;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String description;
    private String listName;

    public TaskList(){
    }

    public TaskList(String description, String listName) {
        this.description = description;
        this.listName = listName;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
