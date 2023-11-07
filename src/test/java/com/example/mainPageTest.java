package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mainPageTest {


    // checking if button works
    private mainPage mainPage;

    @BeforeEach
    public void setUp() {
        mainPage = new mainPage();
    }

    @Test
    public void testConnectButtonActionPerformed() {
        mainPage.connectButton.doClick();
    }
}
