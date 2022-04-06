package com.codeacademy.budgetmymonth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsScreen extends AppCompatActivity {
    TextView wantsText, needsText, savingsText, investmentsText;
    String wants, needs, savings, investments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        wantsText = findViewById(R.id.wants_results);
        needsText = findViewById(R.id.needs_results);
        savingsText = findViewById(R.id.savings_results);
        investmentsText = findViewById(R.id.investments_results);
        wants = intent.getStringExtra("wants");
        needs = intent.getStringExtra("needs");
        savings = intent.getStringExtra("savings");
        investments = intent.getStringExtra("investments");
        wantsText.setText(wants);
        needsText.setText(needs);
        savingsText.setText(savings);
        investmentsText.setText(investments);
    }
}