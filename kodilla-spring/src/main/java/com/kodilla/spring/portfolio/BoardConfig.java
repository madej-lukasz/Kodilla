package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList createToDoList() {
        return new TaskList();
    }
    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList createInProgressList(){
        return new TaskList();
    }
    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList createDoneList(){
        return new TaskList();
    }
    @Bean
    public Board getBoard(){
        return new Board(createToDoList(), createInProgressList(), createDoneList());
    }


}
