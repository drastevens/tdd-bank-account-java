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
        account.depositFunds(100);

        assertThat(account.balance()).isEqualTo(100);
    }
}
