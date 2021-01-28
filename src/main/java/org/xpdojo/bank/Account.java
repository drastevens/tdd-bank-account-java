package org.xpdojo.bank;

public class Account {
    private int balance = 0;

    public int balance() {
        return this.balance;
    }

    public void depositFunds(int amount) {
        if (amount < 0)
            throw new IllegalArgumentException("You cannot deposit a negative number");
        balance += amount;
    }

}
