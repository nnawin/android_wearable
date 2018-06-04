package com.tcs.hkia.baggagenotify;

/**
 * Created by navinn on 01/06/2018.
 */

import android.app.ListActivity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class MyListActivity extends ListActivity {

    public void onCreate(Bundle icicle) {

        super.onCreate(icicle);

        String[] values = new String[] {"Baggage task 1", "Baggage task 2", "Baggage task 3",
                "Baggage task 4", "Baggage task 5", "Baggage task 6", "Baggage task 7", "Baggage task 8",
                "Baggage task 9", "Baggage task 10"};

        MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, values);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        //Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MyListActivity.this,TaskActivity.class);
        intent.putExtra(TaskActivity.EXTRA_TASKNO,(int)id);
        startActivity(intent);
    }


}