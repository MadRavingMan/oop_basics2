package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card{
    private double interest;
    private double credit;


    public CreditCard(double balance, String cardHolderName, String cardNumber,
                      double interest, double credit) {
        super(balance, cardHolderName, cardNumber);
        this.interest = interest;
        this.credit = credit;
    }

    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    double credit(double amount) {
        return super.credit(amount);
    }

    @Override
    double debit(double amount, double atmBalance) {
//        this.setBalance();

        return this.getBalance();
    }
}
