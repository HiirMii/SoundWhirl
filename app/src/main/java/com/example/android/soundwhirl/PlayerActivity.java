package com.example.android.soundwhirl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //Find the View that returns to previous activity
        ImageView arrow = (ImageView) findViewById(R.id.collapse_arrow);

        // Set a click listener on that View
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finishing previous activity
                finish();
            }
        });
    }
}
