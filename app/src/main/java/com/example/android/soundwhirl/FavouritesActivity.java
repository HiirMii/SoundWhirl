package com.example.android.soundwhirl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FavouritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        // Find the View that shows the search activity
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link MainActivity}
                Intent searchIntent = new Intent(FavouritesActivity.this, MainActivity.class);
                // Clearing the activity stack
                searchIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                // Start the new activity
                startActivity(searchIntent);
                // Finishing previous activity
                finish();
            }
        });

        // Find the View that shows the feed activity
        TextView feed = (TextView) findViewById(R.id.feed);

        // Set a click listener on that View
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link FeedActivity}
                Intent feedIntent = new Intent(FavouritesActivity.this, FeedActivity.class);
                // Clearing the activity stack
                feedIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                // Start the new activity
                startActivity(feedIntent);
                // Finishing previous activity
                finish();
            }
        });

        // Find the View that shows the profile activity
        TextView profile = (TextView) findViewById(R.id.profile);

        // Set a click listener on that View
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ProfileActivity}
                Intent profileIntent = new Intent(FavouritesActivity.this, ProfileActivity.class);
                // Clearing the activity stack
                profileIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                // Start the new activity
                startActivity(profileIntent);
                // Finishing previous activity
                finish();
            }
        });

        //Find the View that shows the player activity
        RelativeLayout player = (RelativeLayout) findViewById(R.id.player);

        //Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link PlayerActivity}
                Intent playerIntent = new Intent(FavouritesActivity.this, PlayerActivity.class);
                //Start the new activity
                startActivity(playerIntent);
            }
        });
    }
}
