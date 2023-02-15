package com.luv2code.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class FizzBuzzTest{
    @Test
    @DisplayName("Divisible By Three")
    @Order(1)
     void testForDivisibleByThree(){
         String expected="Fizz";
         assertEquals(expected,FizzBuzz.compute(3),"should return Fizz ");
     }

    @Test
    @DisplayName("Divisible By five")
    @Order(2)
    void testForDivisibleByFive(){
        String expected="Buzz";
        assertEquals(expected,FizzBuzz.compute(5),"should return Buzz ");
    }

    @Test
    @DisplayName("Divisible By  Three and five")
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expected="FizzBuzz";
        assertEquals(expected,FizzBuzz.compute(15),"should return FizzBuzz ");
    }

    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/small-test-data-csv")
    @DisplayName(" Testing with small data file")
    @Order(5)
    void testSmallDtaFile(int value,String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }

    @Test
    @DisplayName("not Divisible By  Three or five")
    @Order(4)
    void testForNotDivisibleByThreeOrFive(){
        String expected="1";
        assertEquals(expected,FizzBuzz.compute(1),"should return 1 ");
    }

    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @DisplayName(" Testing with small data file")
    @Order(6)
    void testMediumDtaFile(int value,String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }

    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @DisplayName(" Testing with Large data file")
    @Order(6)
    void testLargeDtaFile(int value,String expected){
        assertEquals(expected,FizzBuzz.compute(value));
    }

}
//testForNotDivisibleByThreeOrFive
//Testing with small data file