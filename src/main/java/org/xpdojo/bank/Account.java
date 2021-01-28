package org.xpdojo.bank;

public class Account {
    private int balance = 0;

    public int balance() {
        return this.balance;
    }

    public void depositFunds(int amount) {
        balance += amount;
    }

}
