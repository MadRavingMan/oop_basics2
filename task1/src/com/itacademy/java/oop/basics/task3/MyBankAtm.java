package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm {

    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //TODO withdraw should be rearranged, logicaly you don't take out money , when adding money to acc. :)
    @Override
    public void withdraw(CreditCard creditCard, AtmOperations atmOperations, double amount) throws WithdrawExceptions {

        if (atmOperations.equals(AtmOperations.CREDIT)) {
            creditCard.credit(amount);
            System.out.println("Operation successfully");
            System.out.println("New balance is " + creditCard.getBalance());
        } else if (atmOperations.equals(AtmOperations.DEBIT)) {
            if (balance == 0) {
                throw new WithdrawExceptions("Sorry, Atm is out of business.");
            } else if (amount < 0) {
                throw new WithdrawExceptions("Not possible to take out " + amount);
            } else if (balance - amount < 0) {
                throw new WithdrawExceptions("Maximum possible amount can be " + balance);
            } else {
                creditCard.debit(amount);
                System.out.println("Operation successfully");
            }
        }
        System.out.println("Have a nice day.");

    }

    @Override
    public void withdraw(DebitCard debitCard, AtmOperations atmOperations, double amount) throws WithdrawExceptions {
        if (atmOperations.equals(AtmOperations.CREDIT)) {
            debitCard.credit(amount);
            System.out.println("Operation successfully");
            System.out.println("New balance is " + debitCard.getBalance());
        } else if (atmOperations.equals(AtmOperations.DEBIT)) {
            if (balance == 0) {
                throw new WithdrawExceptions("Sorry, Atm is out of business.");
            } else if (amount < 0) {
                throw new WithdrawExceptions("Not possible to take out " + amount);
            } else if (balance - amount < 0) {
                throw new WithdrawExceptions("Maximum possible amount can be " + balance);
            } else {
                debitCard.debit(amount);
                System.out.println("Operation successfully");
            }
        }
        System.out.println("Have a nice day.");

    }


}
