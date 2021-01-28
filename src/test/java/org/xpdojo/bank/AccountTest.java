package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountsHaveABalance() {
        //assertThat("your first test").isBlank();
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void newDepositTest() {
        Account account = new Account();
        account.depositFunds(201);

        assertThat(account.balance()).isEqualTo(201);
    }

    @Test
    public void negativeDepositTest() {
        try {
            Account account = new Account();
            account.depositFunds( -1);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            assertThat(ex.getMessage()).isEqualTo("You cannot deposit a negative number");
        }
    }
}
