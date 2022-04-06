package com.codeacademy.budgetmymonth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Switch;


public class SpendingType extends AppCompatActivity {
    Button budgetMeButton;
    RadioButton frugalButton, spendthriftButton, averageButton;
    RadioGroup spendingType;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch aggressive;
    int paymentsInYear;
    int wants, needs, savings, investments;
    double paymentPerPeriod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spending_type_screen);
        Intent intent = getIntent();
        paymentsInYear = intent.getIntExtra("periods", 0);
        paymentPerPeriod = intent.getDoubleExtra("payment", 0);
        frugalButton = findViewById(R.id.frugal_button);
        spendthriftButton = findViewById(R.id.spendthrift_button);
        averageButton = findViewById(R.id.average_button);
        budgetMeButton = findViewById(R.id.budget_me_button);
        spendingType = findViewById(R.id.spenders);
        aggressive = findViewById(R.id.aggressive_switch);
        budgetMeButton.setOnClickListener(view -> {
            // Click-handling logic
            int spenderButtonId = spendingType.getCheckedRadioButtonId();
            if (spenderButtonId == frugalButton.getId()) {
                if (aggressive.isChecked()) {
                    Budget budget = new Budget(paymentPerPeriod, paymentsInYear, true, "Frugal");
                    budget.createMonthlyBudget();
                    needs = budget.needsBudget;
                    wants = budget.wantsBudget;
                    savings = budget.savingsBudget;
                    investments = budget.investingBudget;
                } else {
                    Budget budget = new Budget(paymentPerPeriod, paymentsInYear, false, "Frugal");
                    budget.createMonthlyBudget();
                    needs = budget.needsBudget;
                    wants = budget.wantsBudget;
                    savings = budget.savingsBudget;
                    investments = budget.investingBudget;
                }
            } else if (spenderButtonId == spendthriftButton.getId()) {
                if (aggressive.isChecked()) {
                    Budget budget = new Budget(paymentPerPeriod, paymentsInYear, true, "Treat Myself");
                    budget.createMonthlyBudget();
                    needs = budget.needsBudget;
                    wants = budget.wantsBudget;
                    savings = budget.savingsBudget;
                    investments = budget.investingBudget;
                } else {
                    Budget budget = new Budget(paymentPerPeriod, paymentsInYear, false, "Treat Myself");
                    budget.createMonthlyBudget();
                    needs = budget.needsBudget;
                    wants = budget.wantsBudget;
                    savings = budget.savingsBudget;
                    investments = budget.investingBudget;
                }
            } else {
                if (aggressive.isChecked()) {
                    Budget budget = new Budget(paymentPerPeriod, paymentsInYear, true, "Average");
                    budget.createMonthlyBudget();
                    needs = budget.needsBudget;
                    wants = budget.wantsBudget;
                    savings = budget.savingsBudget;
                    investments = budget.investingBudget;
                } else {
                    Budget budget = new Budget(paymentPerPeriod, paymentsInYear, false, "Average");
                    budget.createMonthlyBudget();
                    needs = budget.needsBudget;
                    wants = budget.wantsBudget;
                    savings = budget.savingsBudget;
                    investments = budget.investingBudget;
                }
            }
            Intent intent1 = new Intent(SpendingType.this, ResultsScreen.class);
            String needsResult = "$" + needs + " on Needs";
            String wantsResult = "$" + wants + " on Wants";
            String savingsResult = "$" + savings + " on Savings";
            String investmentsResult = "$" + investments + " on Investments";
            intent1.putExtra("needs", needsResult);
            intent1.putExtra("wants", wantsResult);
            intent1.putExtra("savings", savingsResult);
            intent1.putExtra("investments", investmentsResult);
            startActivity(intent1);
        });

    }
}