package com.itacademy.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard( 200, "Ana", "123456", 1, 200);

        DebitCard debitCard = new DebitCard(0, "Gerda", "54321");

        MyBankAtm myBankAtm = new MyBankAtm(1500);
        MyBankAtm myBankAtm1 = new MyBankAtm(0);



    }
}
