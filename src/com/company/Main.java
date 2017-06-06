package com.company;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Amount amount = new Amount();

        amount.addObserver(a);
        amount.addObserver(b);

        for (int i = 0; i<10; i++) {
            amount.amountPlus();
            amount.notifyObservers();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        amount.setAmount(444);
        amount.notifyObservers();

    }
}
