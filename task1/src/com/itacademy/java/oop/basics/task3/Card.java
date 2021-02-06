package com.itacademy.java.oop.basics.task3;

public abstract class Card {

    private double balance;
    private String cardHolderName;
    private String cardNumber;

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

    void credit(double amount) {
         balance +=amount;
    }


    void debit(double amount) throws WithdrawExceptions {
        balance -= amount;
    }



}
