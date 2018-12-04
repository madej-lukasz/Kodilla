package com.kodilla.testing.forum.statistics;

public class CalculateAdvStatistics {
    public int usersCount;
    int postUsers;
    int comments;
    public double averageUsersPost;
    public int averageUsersComments;
    public int averagePostComments;

    public CalculateAdvStatistics(Statistics statistics) {
        this.usersCount = statistics.usersNames().size();
        if(statistics.usersNames().size() !=0) {
            double posts = statistics.postsCount();
            this.averageUsersPost =  posts / (statistics.usersNames().size());//rzutowanie double, dlaczego nie mozna zastosowac
        }
        else {
            averageUsersPost = 0;
        }
        if(usersCount !=0){
            int comments = statistics.commentsCount();
            this.averagePostComments = comments / usersCount;
        }
        else {
            averagePostComments = 0;
        }
        if(statistics.postsCount() != 0) {
            int comments = statistics.commentsCount();
            this.averageUsersComments = comments / statistics.postsCount();
        }
        else {
            averageUsersComments = 0;
        }

    }
    public void showStatistics () {
        System.out.println(this.usersCount + this.averageUsersComments + this.averagePostComments + this.averageUsersPost);
    }
}
