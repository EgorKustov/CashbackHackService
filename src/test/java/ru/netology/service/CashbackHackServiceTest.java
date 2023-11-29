package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainIfAmountIsLessThanBoundary() {
        // Arrange
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;

        // Act
        int result = cashbackHackService.remain(amount);

        // Assert
        Assert.assertEquals(500, result);
    }

    @Test
    public void shouldReturnZeroIfAmountIsEqualToBoundary() {
        // Arrange
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        // Act
        int result = cashbackHackService.remain(amount);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldReturnRemainIfAmountIsGreaterThanBoundary() {
        // Arrange
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1200;

        // Act
        int result = cashbackHackService.remain(amount);

        // Assert
        Assert.assertEquals(800, result);
    }
}