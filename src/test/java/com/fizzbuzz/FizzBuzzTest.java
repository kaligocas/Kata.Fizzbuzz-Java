package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void test_fizzbuzzReplace_returnsFizz() {
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("Fizz", word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsBuzz() {
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("Buzz", word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsFizzBuzz() {
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("FizzBuzz", word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsNumber() {
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.replaceNumber(number);

        assertEquals(String.valueOf(number), word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsFuzzContains3() {
        int number = 131;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("Fizz", word);
    }

    @Test
    public void test_fizzbuzzReplace_returnsFuzzContains5() {
        int number = 151;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.replaceNumber(number);

        assertEquals("Buzz", word);
    }


}
