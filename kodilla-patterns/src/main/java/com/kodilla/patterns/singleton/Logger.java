package com.kodilla.patterns.singleton;

public class Logger {
    private String lastLog = "";
    private static Logger loggerInstance = null;

    private Logger() {

    }

    public String log(String log){
        lastLog = log;
        System.out.println("Log: [" + log + "]");
        return lastLog;
    }
    public String getLastLog(){
        return  lastLog;
    }
    public static Logger getInstance(){
        if (loggerInstance == null){
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

}
