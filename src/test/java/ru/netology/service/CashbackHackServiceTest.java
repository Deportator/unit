package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

//    @Test
//    public void testFall() {
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 1000;
//
//        int actual = cashbackHackService.remain(amount);
//        int expected = 1000;
//
//        assertEquals(expected, actual);
//    }
}