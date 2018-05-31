package com.tcs.hkia.baggagenotify;

/**
 * Created by navinn on 29/05/2018.
 */

public class Tasks {

    private int taskId;
    private String taskName;
    private String taskDescription;

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getTaskName() {
        return taskName;
    }


    public String toString()
    {
        return this.taskName;
    }

    private Tasks (int taskId, String taskName, String taskDescription)
    {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public static final Tasks[] tasksList = {
            new Tasks(1,"Baggage check 1","Check whether the baggage 1 is available"),
            new Tasks(2,"Find baggage 123","Find the lost baggage with bag tag number 123"),
            new Tasks(3,"Baggage check 2","Baggage checking activity 2"),
            new Tasks(3,"Baggage check 3","Baggage checking activity 3"),
            new Tasks(3,"Baggage check 4","Baggage checking activity 4"),
    };
}
