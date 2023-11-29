package ru.netology.service;

//import org.junit.Assert;
//import org.junit.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

//    @Test
//    public void shouldReturnRemainIfAmountIsLessThanBoundary() {
//
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 500;
//
//        int result = cashbackHackService.remain(amount);
//
//        Assert.assertEquals(500, result);
//    }
//
//    @Test
//    public void shouldReturnZeroIfAmountIsEqualToBoundary() {
//
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 1000;
//
//        int result = cashbackHackService.remain(amount);
//
//        Assert.assertEquals(0, result);
//    }
//
//    @Test
//    public void shouldReturnRemainIfAmountIsGreaterThanBoundary() {
//
//        CashbackHackService cashbackHackService = new CashbackHackService();
//        int amount = 1200;
//
//        int result = cashbackHackService.remain(amount);
//
//        Assert.assertEquals(800, result);
//    }
//}

    @Test
    public void shouldReturnRemainIfAmountIsLessThanBoundary1() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;

        int result = cashbackHackService.remain(amount);

        assertEquals(500, result);
    }

    @Test
    public void shouldReturnZeroIfAmountIsEqualToBoundary2() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int result = cashbackHackService.remain(amount);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnRemainIfAmountIsGreaterThanBoundary3() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1200;

        int result = cashbackHackService.remain(amount);

        assertEquals(800, result);
    }
}