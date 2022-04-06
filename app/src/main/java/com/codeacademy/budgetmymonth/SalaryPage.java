package com.codeacademy.budgetmymonth;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SalaryPage extends AppCompatActivity {
    Button monthlyButton, weeklyButton, biweeklyButton, quarterlyButton, annuallyButton;
    public int paymentsInYear;
    public double paymentPerPeriod;
    TextView clientInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salary_screen);
        monthlyButton = findViewById(R.id.monthly_button);
        clientInput = findViewById(R.id.client_pay_button);
        weeklyButton = findViewById(R.id.weekly_button);
        quarterlyButton = findViewById(R.id.quarterly_button);
        biweeklyButton = findViewById(R.id.biweekly_button);
        annuallyButton = findViewById(R.id.annually_button);
        annuallyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click-handling logic
                paymentsInYear = 1;
                paymentPerPeriod = Double.parseDouble(clientInput.getText().toString());
                Intent intent = new Intent(SalaryPage.this, SpendingType.class);
                intent.putExtra("periods", paymentsInYear);
                intent.putExtra("payment", paymentPerPeriod);
                startActivity(intent);
            }
        });
        weeklyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click-handling logic
                paymentsInYear = 52;
                paymentPerPeriod = Double.parseDouble(clientInput.getText().toString());
                Intent intent = new Intent(SalaryPage.this, SpendingType.class);
                intent.putExtra("periods", paymentsInYear);
                intent.putExtra("payment", paymentPerPeriod);
                startActivity(intent);
            }
        });
        monthlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click-handling logic
                paymentsInYear = 12;
                paymentPerPeriod = Double.parseDouble(clientInput.getText().toString());
                Intent intent = new Intent(SalaryPage.this, SpendingType.class);
                intent.putExtra("periods", paymentsInYear);
                intent.putExtra("payment", paymentPerPeriod);
                startActivity(intent);
            }
        });
        biweeklyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click-handling logic
                paymentsInYear = 26;
                paymentPerPeriod = Double.parseDouble(clientInput.getText().toString());
                Intent intent = new Intent(SalaryPage.this, SpendingType.class);
                intent.putExtra("periods", paymentsInYear);
                intent.putExtra("payment", paymentPerPeriod);
                startActivity(intent);
            }
        });
        quarterlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click-handling logic
                paymentsInYear = 4;
                paymentPerPeriod = Double.parseDouble(clientInput.getText().toString());
                Intent intent = new Intent(SalaryPage.this, SpendingType.class);
                intent.putExtra("periods", paymentsInYear);
                intent.putExtra("payment", paymentPerPeriod);
                startActivity(intent);
            }
        });
    }
}

