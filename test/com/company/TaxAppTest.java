package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TaxAppTest {

    @Mock
    Tax tax;

    @Mock
    ConsoleInputOutput consoleInputOutput;

    @Mock
    Parser parser;

    @Test
    public void shouldAbleToCalculateTotalTax() {
        TaxApp taxApp = new TaxApp(tax, consoleInputOutput, parser);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("1 book at 10.00".getBytes());
        System.setIn(byteArrayInputStream);
        double actualTax = taxApp.getTotalTax();
        double expectedTax = 10.5;

        assertEquals(actualTax,expectedTax, 0.05d);
    }

}