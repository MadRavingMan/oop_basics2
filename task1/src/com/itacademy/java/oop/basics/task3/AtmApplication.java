package com.itacademy.java.oop.basics.task3;

public class AtmApplication {
    public static void main(String[] args) throws WithdrawExceptions {

        CreditCard creditCard = new CreditCard( 200, "Ana", "123456", 1, 200);

        DebitCard debitCard = new DebitCard(0, "Gerda", "54321");

        MyBankAtm myBankAtm = new MyBankAtm(1500);
        MyBankAtm myBankAtm1 = new MyBankAtm(0);

        System.out.println("");

        try {
            myBankAtm1.withdraw(creditCard, AtmOperations.DEBIT,150 );
        } catch (WithdrawExceptions exceptions){
            System.out.println(exceptions);;
        }

        System.out.println("");

        try {
            myBankAtm.withdraw(creditCard, AtmOperations.DEBIT,150 );
        } catch (WithdrawExceptions exceptions){
            System.out.println(exceptions);;
        }

        System.out.println("");

        try {
            myBankAtm.withdraw(debitCard, AtmOperations.DEBIT,1500 );
        } catch (WithdrawExceptions exceptions){
            System.out.println(exceptions);;
        }

        System.out.println("");
        myBankAtm.setBalance(1500);

        try {
            myBankAtm.withdraw(creditCard, AtmOperations.DEBIT,350 );
        } catch (WithdrawExceptions exceptions){
            System.out.println(exceptions);;
        }

        System.out.println(creditCard.getBalance());
        debitCard.credit(150);
        System.out.println(creditCard.getBalance());

        System.out.println("");

        try {
            myBankAtm.withdraw(debitCard, AtmOperations.DEBIT,1600 );
        } catch (WithdrawExceptions exceptions){
            System.out.println(exceptions);;
        }

        System.out.println(debitCard.getBalance());

    }
}
