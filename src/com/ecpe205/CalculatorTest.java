package com.ecpe205;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {
    Calculator calc;

    @BeforeAll
    void setup(){
        calc = new Calculator();
    }

    //CREATE A TEST TO TEST isEven
    @Test
    void shouldCheckValueIsEven() {
        assertEquals(true,calc.isEven(2));
        assertEquals(false,calc.isEven(1));
    }

    @Test
    void shouldCheckValueIsOdd() {
        assertEquals(true,calc.isOdd(1));
        assertEquals(false,calc.isOdd(2));
    }


    @Test
    @DisplayName("Sum 2 encoded values")
    void shouldSumTwoEncodedValues() {

        // 1 + 2 = 3
        assertEquals(3, calc.sum(1,2) );
        assertEquals(9, calc.sum(5,4) );
        assertEquals(5, calc.sum(3,2) );
        assertEquals(14, calc.sum(5,9) );
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void shouldSumValueWithOne( int value ) {
        assertEquals(value + 1, calc.sum(value, 1));
    }

    @ParameterizedTest
    @MethodSource("sumInputValues")
    void shouldSumTwoInputValues(int a, int b) {
        assertEquals(a + b, calc.sum(a, b));
    }

    static Stream<Arguments> sumInputValues () {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(4,6),
                Arguments.of(2,7),
                Arguments.of(3,7),
                Arguments.of(3,0)
        );
    }

    static Stream<Arguments> arrayOfIntegerSets () {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,1}),
                Arguments.of(new int[]{7,1,5,4,1}),
                Arguments.of(new int[]{7,2,8,3,4})
        );
    }

    @Test
    @MethodSource("PowerBase")
    void shouldPower(double x, double y){
        assertEquals(Math.pow(x,y), calc.pow(x,y));
    }

    static Stream<Arguments> Power(){
        return Stream.of(
                Arguments.of(1,3),
                Arguments.of(4,6),
                Arguments.of(3,0),
                Arguments.of(4,2),
                Arguments.of(5,3)
        );

    }

    @ParameterizedTest
    @MethodSource("FactorialValue")
    void shouldFactorialValue(int a, int b){
        assertEquals(a, calc.factorial(b));
    }

    static Stream<Arguments> FactorialValues () {
        return Stream.of(
                Arguments.of(3, 0),
                Arguments.of(2, 4),
                Arguments.of(9, 3),
                Arguments.of(25, 4),
                Arguments.of(30, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("PalindromeValue")
    void shouldPalindrome(Boolean a, String value){
        assertEquals(a, calc.Palindrome(value));
    }

    static Stream<Arguments> PalindromeInputValues () {
        return Stream.of(
                Arguments.of(true,"dad"),
                Arguments.of(true,"rivever"),
                Arguments.of(false,"World"),
                Arguments.of(false,"Hello"),
                Arguments.of(true,"sis")
        );
    }

    @ParameterizedTest
    @MethodSource("Sorting")
    void shouldPalindromeOne(int[] a, int[] b){
        assertEquals(a, calc.Sort(b));
    }

    static Stream<Arguments> ArrayInputValues () {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, new int[]{2,1,3,5,4}),
                Arguments.of(new int[]{0,1,2,3,8},new int[]{8,0,1,3,2}),
                Arguments.of(new int[]{1,3,5,7,8},new int[]{5,3,8,7,1}),
                Arguments.of(new int[]{10,13,18,19,20},new int[]{18,10,13,20,19}),
                Arguments.of(new int[]{2,3,6,9,10},new int[]{9,2,10,6,3})
        );
    }

}