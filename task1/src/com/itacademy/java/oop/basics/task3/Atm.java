package com.itacademy.java.oop.basics.task3;

public interface Atm {

    public void withdraw(CreditCard creditCard, AtmOperations atmOperations, double amount) throws Exception;
    public void withdraw(DebitCard debitCard, AtmOperations atmOperations, double amount) throws Exception;

}
