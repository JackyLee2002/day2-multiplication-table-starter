package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_true_when_isInRange_given_a_number_5() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 5;
        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);
        // Then
        assertTrue(isInRange);
    }

    // TODO: add more tests for isInRange

    @Test
    void shouldReturnFalse_whenisInRange_givenANumber0() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 0;
        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);
        // Then
        assertFalse(isInRange);
    }
    
    @Test
    void shouldReturnFalse_whenIsInRange_givenANumber1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 1001;
        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);
        // Then
        assertFalse(isInRange);
    }

    @Test
    void shouldReturnTrue_whenIsStarterNotBiggerThanEnd_givenStart2AndEnd3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;
        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start, end);
        // Then
        assertTrue(isStarterNotBiggerThanEnd);
    }

    @Test
    void shouldReturnTrue_whenIsStarterNotBiggerThanEnd_givenStart3AndEnd3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 3;
        // When
        boolean result = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start, end);
        // Then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalse_whenIsStarterNotBiggerThanEnd_givenStart3AndEnd2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 2;
        // When
        boolean result = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start, end);
        // Then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrue_whenIsValid_givenStart2AndEnd3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;
        // When
        boolean result = multiplicationTableBuilder.isValid(start, end);
        // Then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalse_whenInValid_givenStart2AndEnd1() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1;
        // When
        boolean result = multiplicationTableBuilder.isValid(start, end);
        // Then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalse_whenInValid_givenStart0AndEnd2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 0;
        int end = 2;
        // When
        boolean result = multiplicationTableBuilder.isValid(start, end);
        // Then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalse_whenInValid_givenStart2AndEnd1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1001;
        // When
        boolean result = multiplicationTableBuilder.isValid(start, end);
        // Then
        assertFalse(result);
    }
}

