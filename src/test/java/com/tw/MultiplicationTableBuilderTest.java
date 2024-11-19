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
}

