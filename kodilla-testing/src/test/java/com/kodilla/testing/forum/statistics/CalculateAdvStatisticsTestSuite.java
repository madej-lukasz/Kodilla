package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {
    @Test
    public void test1() {
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, calculateAdvStatistics.averageUsersComments);
        Assert.assertEquals(0, calculateAdvStatistics.averagePostComments);
        Assert.assertEquals(0, calculateAdvStatistics.usersCount);

    }
    @Test
    public void test2() {
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics(statisticsMock);
        ArrayList<String> userNames = new ArrayList<>(); {
            for (int n = 0; n < 100; n++) {
                userNames.add("number" + n);
            }
            when(statisticsMock.usersNames()).thenReturn(userNames);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(100);


            Assert.assertEquals(100, calculateAdvStatistics.averageUsersComments);
            Assert.assertEquals(1000, calculateAdvStatistics.averagePostComments);
            Assert.assertEquals(100, calculateAdvStatistics.usersCount);

        }


    }


}
