package com.example.fitnessgoalapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoseWeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_weight);

        // Button to navigate to Calorie Calculator page
        Button calorieCalculatorButton = findViewById(R.id.calorieCalculatorButton);
        calorieCalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoseWeightActivity.this, CalorieCalculator.class);
                startActivity(intent);
            }
        });
    }
}
