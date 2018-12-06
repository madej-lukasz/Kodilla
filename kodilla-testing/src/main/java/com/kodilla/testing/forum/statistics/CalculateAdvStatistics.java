package com.kodilla.testing.forum.statistics;

public class CalculateAdvStatistics {
    public int usersCount;
    private double averageUsersPost;
    private double averageUsersComments;
    private double averagePostComments;

    public double getAverageUsersPost() {
        return averageUsersPost;
    }

    public double getAverageUsersComments() {
        return averageUsersComments;
    }

    public double getAveragePostComments() {
        return averagePostComments;
    }

    public CalculateAdvStatistics(Statistics statistics) {
        this.usersCount = statistics.usersNames().size();
        if(usersCount !=0) {
            double posts = statistics.postsCount();
            this.averageUsersPost = posts / usersCount;
        }
        else {
            averageUsersPost = 0;
        }
        if(statistics.postsCount() !=0){
            double comments = statistics.commentsCount();
            this.averagePostComments = comments / statistics.postsCount();
        }
        else {
            averagePostComments = 0;
        }
        if(usersCount != 0) {
            int comments = statistics.commentsCount();
            this.averageUsersComments = comments / usersCount;
        }
        else {
            averageUsersComments = 0;
        }

    }

    public void showStatistics () {
        System.out.println(this.usersCount + this.averageUsersComments + this.averagePostComments + this.averageUsersPost);
    }
}
