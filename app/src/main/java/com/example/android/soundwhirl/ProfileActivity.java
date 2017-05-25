package com.example.android.soundwhirl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Find the View that shows the search activity
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link MainActivity}
                Intent searchIntent = new Intent(ProfileActivity.this, MainActivity.class);
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
                Intent feedIntent = new Intent(ProfileActivity.this, FeedActivity.class);
                // Clearing the activity stack
                feedIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                // Start the new activity
                startActivity(feedIntent);
                // Finishing previous activity
                finish();
            }
        });

        // Find the View that shows the favourites activity
        TextView favourites = (TextView) findViewById(R.id.favourites);

        // Set a click listener on that View
        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link FavouritesActivity}
                Intent favouritesIntent = new Intent(ProfileActivity.this, FavouritesActivity.class);
                // Clearing the activity stack
                favouritesIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                // Start the new activity
                startActivity(favouritesIntent);
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
                Intent playerIntent = new Intent(ProfileActivity.this, PlayerActivity.class);
                //Start the new activity
                startActivity(playerIntent);
            }
        });
    }
}
