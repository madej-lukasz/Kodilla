package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("Jan");
        User user2 = new YGeneration("Adam");
        User user3 = new ZGeneration("Zenek");

        //When
        String user1Publisher = user1.sharePost();
        System.out.println("User1: " + user1Publisher);
        String user2Publisher = user2.sharePost();
        System.out.println("User2: " + user2Publisher);
        String user3Publisher = user3.sharePost();
        System.out.println("User3: " + user3Publisher);

        //Then
        Assert.assertEquals("Facebook", user1Publisher);
        Assert.assertEquals("Twitter", user2Publisher);
        Assert.assertEquals("Snapchat", user3Publisher);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user1 = new Millenials("user1");

        //When
        String user1Publisher = user1.sharePost();
        System.out.println("User1: " + user1Publisher);
        user1.setPublisher(new TwitterPublisher());
        user1Publisher = user1.sharePost();
        System.out.println("User1: " + user1Publisher);

        //Then
        Assert.assertEquals("Twitter", user1Publisher);
    }
}
