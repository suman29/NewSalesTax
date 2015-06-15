package com.company;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;

public class BookTest {

    @Test
    public void shouldBeAbleToSetDetailsOfBook() {
        Book book = new Book();
        book.setProductDetails("book1", 12,false);

        double actualOutput = book.priceOnApplyingTax();
        double expectedOutput = 12;

        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldCalculateTotalTaxOfBook() {
        Book book = new Book();
        book.setProductDetails("book1", 10,true);

        double actualOutput = book.priceOnApplyingTax();
        double expectedOutput = 10.5;

        assertThat(actualOutput, is(expectedOutput));
    }

}