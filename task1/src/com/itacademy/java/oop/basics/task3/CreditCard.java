package com.itacademy.java.oop.basics.task3;

public class CreditCard extends Card {
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

    //TODO this.getBalance() or getBalance() or somehow else get from super.?
    @Override
    void debit(double amount) throws WithdrawExceptions {
        double totalWithdrawAmount = amount + amount * 0.01 * interest;
        if (getBalance() - totalWithdrawAmount > (-1*credit)){
            setBalance(getBalance()-totalWithdrawAmount);
        }else {
            throw new WithdrawExceptions("Insufficient funds.");
        }

    }

}
