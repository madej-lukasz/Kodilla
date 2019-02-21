package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.doTheTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("Shopping list", shopping.getTaskName());
        Assert.assertEquals(false, shopping.isTaskExecuted());
    }
    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.doTheTask(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals("Paint the wall", painting.getTaskName());
        Assert.assertEquals(false, painting.isTaskExecuted());
    }
    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drive = taskFactory.doTheTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("Tesco", drive.getTaskName());
        
    }
}
