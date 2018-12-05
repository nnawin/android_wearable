package com.tcs.hkia.baggagenotify;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        setAmbientEnabled();
    }

    public void carousel_task(View view) {
        Toast.makeText(this, "Loading...", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(HomeActivity.this,MyListActivity.class);
        startActivity(intent);
    }


    public void  offload_task(View view) {
        Toast.makeText(this, "Loading...", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(HomeActivity.this,NotificationActivity.class);
        startActivity(intent);
    }

}
