package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCalculations {
    Statistics statistics;

    public int numberOfUsers(Statistics statistics){
        return statistics.usersNames().size();
    }

    public int numberOfPosts(Statistics statistics){
        return statistics.postsCount();
    }

    public int numberOfComments(Statistics statistics){
        return statistics.commentsCount();
    }

    public double averagePostPerUserAmount(Statistics statistics){
        return (double)statistics.postsCount() / statistics.usersNames().size();
    }

    public double averageCommentsPerUserAmount(Statistics statistics){
        return (double)statistics.commentsCount() / statistics.usersNames().size();
    }

    public double averageCommentsPerPostAmount(Statistics statistics){
        return (double)statistics.commentsCount() / statistics.postsCount();
    }
}
