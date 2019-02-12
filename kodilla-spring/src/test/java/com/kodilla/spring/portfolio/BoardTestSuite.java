package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().tasks.add("To Do");
        board.getInProgressList().tasks.add("Progress");
        board.getDoneList().tasks.add("Done");

        //Then
        Assert.assertEquals("To Do",board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Progress",board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Done",board.getDoneList().getTasks().get(0));

    }
}
