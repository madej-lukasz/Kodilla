package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final private String taskName;
    final private String color;
    final private String whatToPaint;
    private String executeTask = null;

    public PaintingTask(final String taskName,final String color,final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        executeTask = "Paint: "+ whatToPaint + " by: " + color;
        return  executeTask;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(executeTask != null){
            System.out.println(taskName + "job done");
        }else{
            System.out.println(taskName + " not finished");
        }
        return executeTask !=null;
    }
}
