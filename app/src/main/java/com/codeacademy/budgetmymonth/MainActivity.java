package com.codeacademy.budgetmymonth;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_screen);
        startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(view -> {
            // Click-handling logic
            Intent intent = new Intent(MainActivity.this, SalaryPage.class);
            startActivity(intent);
        });
    }
}

