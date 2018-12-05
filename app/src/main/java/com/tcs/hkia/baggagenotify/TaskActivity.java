package com.tcs.hkia.baggagenotify;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

    public void taskComplete(View view) {
        Toast.makeText(this, "Task completed", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(TaskActivity.this,MyListActivity.class);
        startActivity(intent);
    }

    public void taskDeclined(View view) {
        Toast.makeText(this, "Task Cancelled", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(TaskActivity.this,MyListActivity.class);
        startActivity(intent);
    }

}
