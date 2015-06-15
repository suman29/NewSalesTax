package com.company;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    HashMap<String, Products> mappedProducts;

    public void setUp(){
        mappedProducts = new HashMap<>();
        mappedProducts.put("Book", new Book());
        mappedProducts.put("Other Products", new OtherProducts());
    }


    @Test
    public void shouldGiveAProductOnParsingTheUserInput() {
        Parser parser = new Parser();
        Book book = new Book();
        book.setProductDetails("Book",10.0,false);

        Products actualProduct = parser.getProduct("1 Book at 10");
        Products expectedProduct = book;

        assertEquals(actualProduct,expectedProduct);
    }

}