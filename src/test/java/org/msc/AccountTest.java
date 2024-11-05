package org.msc;

import org.junit.jupiter.api.Test;
import org.msc.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    void when_accountIsCreated_thenBalanceIsZEro (){
        //When
        Account account = new Account();
        //Then
        double balance = account.getBalance();
        assertEquals(0, balance);
    }

    @Test
    void createAccount(){
        Account account = new Account(1000);

        double balance = account.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    void when_depositAccountMustBeSimInBalance(){
        Account account = new Account(1000);
        account.deposit(500);

        double balance = account.getBalance();
        assertEquals(1500, balance);
    }

    @Test
    void when_depositAccountMustBeTheSameIfAmountIsNegative(){
        Account account = new Account(1000);
        account.deposit(-500);

        double balance = account.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    void retirarMoneyMoreAmount_thenBalance(){
        Account account = new Account(1000);

        assertThrows(IllegalAccessException.class,() -> account.withdraw(2000));

        double balance = account.getBalance();
        assertEquals(1000,balance);
    }
    

}
