package com.tcs.hkia.baggagenotify;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class TaskActivity extends WearableActivity {


    public static final String EXTRA_TASKNO = "taskNo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        //get drink from intent
        int taskNo = (Integer)getIntent().getExtras().get(EXTRA_TASKNO);
        Tasks task = Tasks.tasksList[taskNo];

        //get the drink name and set in the layout
        TextView nameDisp = (TextView) findViewById(R.id.taskName);
        nameDisp.setText(task.getTaskName());

        //get drink description
        TextView taskDesc = (TextView) findViewById(R.id.taskDescription);
        taskDesc.setText(task.getTaskDescription());
    }
}
