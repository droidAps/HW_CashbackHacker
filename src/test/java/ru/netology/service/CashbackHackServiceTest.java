package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainAmountLessThan1000() {
        int expected = 300;
        int actual = service.remain(700);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainAmountMoreThan1000() {
        int expected = 200;
        int actual = service.remain(1800);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainAmountEqualTo1000() {
        int expected = 0;
        int actual = service.remain(111000);

        assertEquals(actual, expected);
    }
}