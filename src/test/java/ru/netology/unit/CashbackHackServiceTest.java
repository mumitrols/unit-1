package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
   public void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
   public void shouldReturn200IfAmountIs800() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn900IfAmountIs6100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 6100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }
}