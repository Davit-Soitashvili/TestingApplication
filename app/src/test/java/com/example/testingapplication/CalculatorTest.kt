package com.example.testingapplication

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class CalculatorTest {

    @Test
    fun `getCalculatedSum returns valid value`() {
        // arrange
        val expectedResult = 30
        val calculator = Calculator()
        // act
        val result = calculator.getCalculatedSum(10, 20)
        // assert
        assertEquals(result, expectedResult)
    }

    @Test
    fun `getCalculatedSum returns invalid value`() {
        // arrange
        val expectedResult = 30
        val calculator = Calculator()
        // act
        val result = calculator.getCalculatedSum(10, 22)
        // assert
        assertNotEquals(result, expectedResult)
    }
}