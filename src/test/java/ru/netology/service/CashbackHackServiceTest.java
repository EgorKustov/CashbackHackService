package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWithLessThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int remain = cashbackHackService.remain(900);
        Assert.assertEquals(100, remain);
    }

    @Test
    public void testRemainWithBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int remain = cashbackHackService.remain(1000);
        Assert.assertEquals(0, remain);
    }

    @Test
    public void testRemainWithMoreThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int remain = cashbackHackService.remain(1500);
        Assert.assertEquals(500, remain);
    }
}