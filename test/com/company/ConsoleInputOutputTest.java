package com.company;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class ConsoleInputOutputTest {

    @Test
    public void checkIfTheUserGivesAnInput() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("1 book at 12.49".getBytes());
        System.setIn(byteArrayInputStream);
        ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();

        String actualInput = consoleInputOutput.takeUserInputForMainMenu();
        String expectedInput = "1 book at 12.49";

        assertEquals(expectedInput, actualInput);
    }

}