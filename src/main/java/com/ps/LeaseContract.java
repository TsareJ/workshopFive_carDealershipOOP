package com.ps;

public class LeaseContract extends Contract {
    private double expectedEndingValue;
    private double leaseFee;
    private static double interestRate = 0;
    private static int term = 36;

    public LeaseContract(String date, String customerName, String customerEmail) {
        super(date, customerName, customerEmail);
    }


    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
