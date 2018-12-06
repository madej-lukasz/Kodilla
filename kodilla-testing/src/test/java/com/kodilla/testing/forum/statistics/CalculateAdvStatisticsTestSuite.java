package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics1() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> user = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, calculateAdvStatistics.getAverageUsersComments(), 0.1);
        Assert.assertEquals(0, calculateAdvStatistics.getAveragePostComments(), 0.1);
        Assert.assertEquals(0, calculateAdvStatistics.usersCount);
        Assert.assertEquals("posts per user", 0,calculateAdvStatistics.getAverageUsersPost(), 0.1);
    }
    @Test
    public void testCalculateAdvStatistics2() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> user = new ArrayList<>(); {
            for (int n = 0; n < 100; n++) {
                user.add("number" + n);
            }
            when(statisticsMock.usersNames()).thenReturn(user);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(10000);

            CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statisticsMock);


            Assert.assertEquals("averageUserComments",100, calculateAdvStatistics.getAverageUsersComments(),0.1);
            Assert.assertEquals("averagePostComments",10, calculateAdvStatistics.getAveragePostComments(),0.1);
            Assert.assertEquals("usersCount",100, calculateAdvStatistics.usersCount);
            Assert.assertEquals("posts per user", 10,calculateAdvStatistics.getAverageUsersPost(), 0.1);
        }


    }
    @Test
    public void testCalculateAdvStatistics3() {
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> user = new ArrayList<>();
        {
            for (int n = 0; n < 1000; n++) {
                user.add("number" + n);
            }
            when(statisticsMock.usersNames()).thenReturn(user);
            when(statisticsMock.postsCount()).thenReturn(10000);
            when(statisticsMock.commentsCount()).thenReturn(100000);

            CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statisticsMock);


            Assert.assertEquals("averageUserComments", 100, calculateAdvStatistics.getAverageUsersComments(), 0.1);
            Assert.assertEquals("averagePostComments", 10, calculateAdvStatistics.getAveragePostComments(), 0.1);
            Assert.assertEquals("usersCount", 1000, calculateAdvStatistics.usersCount);
            Assert.assertEquals("posts per user", 10,calculateAdvStatistics.getAverageUsersPost(), 0.1);
        }
    }

}
