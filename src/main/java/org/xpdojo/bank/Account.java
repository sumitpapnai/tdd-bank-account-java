package org.xpdojo.bank;

public class Account {

    private int balance = 0;

    public void open(int amount) {

        balance = amount;
    }

    public void deposit(int amount) {

        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }
}
