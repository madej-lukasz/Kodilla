package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    final private String taskName;
    final private String where;
    final private String using;
    private String executeTask = null;

    public DrivingTask(final String taskName,final String where,final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        executeTask = "Go to: " + where + "by " + using;
        return executeTask;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executeTask != null){
            System.out.println(taskName+ " done");
        }else{
            System.out.println(taskName + " still to do");
        }
        return executeTask !=null;
    }
}
