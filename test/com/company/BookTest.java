package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void shouldCalculateSalesTaxOfBook() {
        Book book = new Book();
        book.setProductDetails("book1", 10,true);

        double actualOutput = book.salesTax();
        double expectedOutput = 0.5;

        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldRepresentTheDetailsOfBookInProperFormat() {
        Book book = new Book();
        book.setProductDetails("book1", 10, true);

        String actualString = book.toString();
        String expectedString = "1 imported book1:10.0";

        assertEquals(actualString,expectedString);
    }

    @Test
       public void shouldBeEqualToItself() {

           Book firstBook = new Book();
           boolean actual = firstBook.equals(firstBook);

           assertEquals(true, actual);
       }

       @Test
       public void shouldFollowSymmetricProperty() {
           Book firstBook = new Book();
           Book secondBook = new Book();
           boolean actual = (firstBook.equals(secondBook) == secondBook.equals(firstBook));

           assertEquals(true, actual);
       }

       @Test
       public void shouldFollowTransitiveProperty() {
           Book firstBook = new Book();
           Book secondBook = new Book();
           Book thirdBook = new Book();
           boolean actual = firstBook.equals(secondBook) &&
                   secondBook.equals(thirdBook) &&
                   firstBook.equals(thirdBook);

           assertEquals(true, actual);
       }

       @Test
       public void shouldHaveSameHashCodeIfBooksAreEqual() {
           Book firstBook = new Book();
           Book secondBook = new Book();

           boolean actual = firstBook.equals(secondBook) && (firstBook.hashCode() == secondBook.hashCode());

           assertEquals(true, actual);
       }

}