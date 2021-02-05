package com.itacademy.java.oop.basics.task3;

public abstract class Card {

    private double balance;
    private static String cardHolderName;
    private static String cardNumber;

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    double credit(double amount) {
        return balance +=amount;
    }


    double debit(double amount, double atmBalance) {
        return balance;
    }

//    abstract double debit(double amount, double atmBalance);
}
