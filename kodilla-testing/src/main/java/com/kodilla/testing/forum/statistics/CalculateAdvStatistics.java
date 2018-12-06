package com.kodilla.testing.forum.statistics;

public class CalculateAdvStatistics {
    public int usersCount;
    int postUsers;
    int comments;
    public double averageUsersPost;
    public double averageUsersComments;
    public double averagePostComments;

    public CalculateAdvStatistics(Statistics statistics) {
        this.usersCount = statistics.usersNames().size();
        if(statistics.usersNames().size() !=0) {
            double posts = statistics.postsCount();
            this.averageUsersPost = posts / (statistics.usersNames().size());
        }
        else {
            averageUsersPost = 0;
        }
        if(usersCount !=0){
            double posts = statistics.postsCount();
            this.averagePostComments = posts / usersCount;
        }
        else {
            averagePostComments = 0;
        }
        if(usersCount != 0) {
            int comments = statistics.commentsCount();
            this.averageUsersComments = (double)comments / usersCount;
        }
        else {
            averageUsersComments = 0;
        }

    }
    public void showStatistics () {
        System.out.println(this.usersCount + this.averageUsersComments + this.averagePostComments + this.averageUsersPost);
    }
}
