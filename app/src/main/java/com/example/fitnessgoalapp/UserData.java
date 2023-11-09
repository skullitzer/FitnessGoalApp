package com.example.fitnessgoalapp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserData extends AppCompatActivity {
    private EditText firstNameEditText, lastNameEditText, heightEditText, weightEditText, ageEditText, healthConditionEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        firstNameEditText = findViewById(R.id.firstNameEditText);
        lastNameEditText = findViewById(R.id.lastNameEditText);
        heightEditText = findViewById(R.id.heightEditText);
        weightEditText = findViewById(R.id.weightEditText);
        ageEditText = findViewById(R.id.ageEditText);
        healthConditionEditText = findViewById(R.id.healthConditionEditText);
        saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveUserData();
                Intent intent = new Intent(getApplicationContext(), GoalChoice.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void saveUserData() {
        String firstName = firstNameEditText.getText().toString();
        String lastName = lastNameEditText.getText().toString();
        String height = heightEditText.getText().toString();
        String weight = weightEditText.getText().toString();
        String age = ageEditText.getText().toString();
        String healthCondition = healthConditionEditText.getText().toString();

        // Perform validation if needed

        // Save user data to Firebase Realtime Database
        DatabaseReference userRef = FirebaseDatabase.getInstance().getReference().child("users").push();
        userRef.child("firstName").setValue(firstName);
        userRef.child("lastName").setValue(lastName);
        userRef.child("height").setValue(height);
        userRef.child("weight").setValue(weight);
        userRef.child("age").setValue(age);
        userRef.child("healthCondition").setValue(healthCondition);

        // Display a Toast message
        Toast.makeText(this, "User data saved", Toast.LENGTH_SHORT).show();
    }

}
