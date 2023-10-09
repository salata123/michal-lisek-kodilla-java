package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;

public class Mentor implements Observer {
    private final String mentorUsername;
    private int updateCount;


    public Mentor(String mentorUsername) {
        this.mentorUsername = mentorUsername;
    }
    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(mentorUsername + ": New task from " + taskQueue.getStudentsUsername() + "\n" +
                " (total: " + taskQueue.getTasks().size() + " tasks from this user.)");
        updateCount++;
    }

    public String getMentorUsername() {
        return mentorUsername;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
