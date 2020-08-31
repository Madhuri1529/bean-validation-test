package com.model;

import com.Frequency;

public class AmountCalculations {
    private static final String BENEFITS_AMOUNT_PER_YEAR = "2985.859";
    private static int calculatedAmount;

    public static void main(String[] args) throws NumberFormatException {
        Frequency[] frequencies = Frequency.values();
        try {
            for (Frequency week : frequencies) {

                switch (week) {
                    case WEEK:
                        calculatedAmount = Integer.valueOf(BENEFITS_AMOUNT_PER_YEAR) / 52;
                        System.out.println("Weekly calculated amount: " + calculatedAmount);
                        break;
                    case TWO_WEEK:
                        calculatedAmount = Integer.valueOf(BENEFITS_AMOUNT_PER_YEAR) / 26;
                        System.out.println("Two Weeks calculated amount: " + calculatedAmount);
                        break;
                    case FOUR_WEEK:
                        calculatedAmount = Integer.valueOf(BENEFITS_AMOUNT_PER_YEAR) / 13;
                        System.out.println("Monthly calculated amount: " + calculatedAmount);
                        break;
                    case QUARTER:
                        calculatedAmount = Integer.valueOf(BENEFITS_AMOUNT_PER_YEAR) / 4;
                        System.out.println("Quaterly calculated amount: " + calculatedAmount);
                        break;
                    case YEAR:
                        calculatedAmount = Integer.valueOf(BENEFITS_AMOUNT_PER_YEAR);
                        System.out.println("Yearly calculated amount: " + calculatedAmount);
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("unable  to calculate the value:" + e.getMessage());
        }


    }
}


