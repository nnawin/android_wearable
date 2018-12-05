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

        String[] values = new String[] {"Carousel task 1", "Carousel task 2", "Carousel task 3",
                "Carousel task 4", "Carousel task 5", "Carousel task 6", "Carousel task 7", "Carousel task 8",
                "Carousel task 9", "Carousel task 10"};

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