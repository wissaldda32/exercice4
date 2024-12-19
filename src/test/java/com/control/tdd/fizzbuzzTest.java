package com.control.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class fizzbuzzTest {



    @Test
    public void test() {
        fizzbuzz fizzbuzz = new fizzbuzz();
        Assertions.assertEquals("1", fizzbuzz.action(1));
    }
    @Test
    public void test() {




        fizzbuzz fizzbuzz = new fizzbuzz();
        Assertions.assertEquals("fizz",fizzbuzz.action(3));
        Assertions.assertEquals("4",fizzbuzz.action(4));


        Assertions.assertEquals("buzz",fizzbuzz.action(5));


        Assertions.assertEquals("fizz",fizzbuzz.action(2*3));
        Assertions.assertEquals("buzz",fizzbuzz.action(2*5));
}
    }



