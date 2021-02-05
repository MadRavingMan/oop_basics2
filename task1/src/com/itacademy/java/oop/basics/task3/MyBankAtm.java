package com.itacademy.java.oop.basics.task3;

public class MyBankAtm implements Atm{

    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(CreditCard creditCard, AtmOperations atmOperations, double amount) throws WithdrawExceptions {

       if (atmOperations.equals(AtmOperations.CREDIT)){
           double finalBalance = creditCard.credit(amount);
           System.out.println("New balance is " + finalBalance);
       }else {
           if (balance == 0){
               throw new WithdrawExceptions("Sorry, Atm is out of business.");
           }else if (amount < 0){
               throw new WithdrawExceptions("Not possible to take out " + amount);
           } else if (balance - amount < 0){
               throw new WithdrawExceptions("There maximum amount can be " + balance);
           }else {
               System.out.println("thank you, come again.");
           }
       }


    }

    @Override
    public void withdraw(DebitCard debitCard, AtmOperations atmOperations, double amount) throws Exception {

    }


}
