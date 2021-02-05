package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card{

    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    @Override
    double credit(double amount) {
        return super.credit(amount);
    }
}
