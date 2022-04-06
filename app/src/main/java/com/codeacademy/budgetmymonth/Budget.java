package com.codeacademy.budgetmymonth;
import java.lang.Math;

public class Budget {
    public int monthlySalary, wantsBudget, needsBudget, investingBudget, savingsBudget;
    public Boolean aggressive;
    public String spendingType;


    public Budget(double pay, int yearlyPayments, Boolean isAggressive, String spendingHabits) {
        monthlySalary = (int) Math.round(pay * yearlyPayments / 12);
        aggressive = isAggressive;
        spendingType = spendingHabits;
    }
    public void createMonthlyBudget() {
        needsBudget = (int) Math.round(.5 * monthlySalary);
        switch (spendingType) {
            case "Treat Myself":
                wantsBudget = (int) Math.round(.35 * monthlySalary);
                if (aggressive) {
                    savingsBudget = (int) Math.round(.05 * monthlySalary);
                    investingBudget = (int) Math.round(.1 * monthlySalary);
                } else {
                    savingsBudget = (int) Math.round(.1 * monthlySalary);
                    investingBudget = (int) Math.round(.05 * monthlySalary);
                }
                break;
            case "Frugal":
                wantsBudget = (int) Math.round(.2 * monthlySalary);
                if (aggressive) {
                    savingsBudget = (int) Math.round(.1 * monthlySalary);
                    investingBudget = (int) Math.round(.2 * monthlySalary);
                } else {
                    savingsBudget = (int) Math.round(.2 * monthlySalary);
                    investingBudget = (int) Math.round(.1 * monthlySalary);
                }
                break;
            default:
                wantsBudget = (int) Math.round(.3 * monthlySalary);
                if (aggressive) {
                    savingsBudget = (int) Math.round(.075 * monthlySalary);
                    investingBudget = (int) Math.round(.125 * monthlySalary);
                } else {
                    savingsBudget = (int) Math.round(.125 * monthlySalary);
                    investingBudget = (int) Math.round(.075 * monthlySalary);
                }
                break;
        }

    }
}
