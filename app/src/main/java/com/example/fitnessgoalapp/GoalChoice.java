package com.example.fitnessgoalapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GoalChoice extends AppCompatActivity {

    private TextView titleTextView;
    private Spinner goalSpinner;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_choice);

        // Initialize the views
        titleTextView = findViewById(R.id.titleTextView);
        goalSpinner = findViewById(R.id.goalSpinner);
        nextButton = findViewById(R.id.nextButton);

        // Set an OnClickListener for the nextButton
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the SecondActivity
             //   Intent intent = new Intent(GoalChoice.this, SecondActivity.class);
              //  startActivity(intent);
            }
        });


    }
}
