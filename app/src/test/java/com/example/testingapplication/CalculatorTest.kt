package com.example.testingapplication

import org.junit.Test

class CalculatorTest {

    @Test
    fun `getCalculatedSum returns valid value`() {
        val expectedResult = 30
        val calculator = Calculator()
        assert(calculator.getCalculatedSum(10, 20) == expectedResult)
    }

    @Test
    fun `getCalculatedSum returns invalid value`() {
        val expectedResult = 30
        val calculator = Calculator()
        assert(calculator.getCalculatedSum(10, 22) != expectedResult)
    }

}