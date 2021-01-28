package org.xpdojo.bank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {


    @Test
	public void depositAnAmountToOpenTheAccount() {

        Account account = new Account();
        account.open(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account account = new Account();
        account.deposit(10);
    }

}
