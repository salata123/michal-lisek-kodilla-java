package com.kodilla.testing.forum.statistics;

public class StatisticsCalculations {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averagePostsPerUser = (double) numberOfPosts / numberOfUsers;
        averageCommentsPerUser = (double) numberOfComments / numberOfUsers;
        averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
    }

    public int numberOfUsers(){
        return numberOfUsers;
    }

    public int numberOfPosts(){
        return numberOfPosts;
    }

    public int numberOfComments(){
        return numberOfComments;
    }

    public double averagePostPerUserAmount(){
        return averagePostsPerUser;
    }

    public double averageCommentsPerUserAmount(){
        return averageCommentsPerUser;
    }

    public double averageCommentsPerPostAmount(){
        return averageCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPost);
    }
}
