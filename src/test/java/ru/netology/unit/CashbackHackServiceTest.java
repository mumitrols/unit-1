package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn300IfAmountIs5700() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 5700;

        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }
}