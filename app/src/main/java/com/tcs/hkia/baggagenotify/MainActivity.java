package com.tcs.hkia.baggagenotify;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listTasks = getListView();

        //Array adpater is used to bind the data from a non-static source to a list

        ArrayAdapter<Tasks> listAdapter = new ArrayAdapter<>(
                this,android.R.layout.simple_expandable_list_item_1,Tasks.tasksList
        );

        listTasks.setAdapter(listAdapter);

    }


    protected void onListItemClick(ListView listView, View itemView, int position, long id)
    {
        Intent intent = new Intent(MainActivity.this,TaskActivity.class);
        intent.putExtra(TaskActivity.EXTRA_TASKNO,(int)id);
        startActivity(intent);
    }
}
