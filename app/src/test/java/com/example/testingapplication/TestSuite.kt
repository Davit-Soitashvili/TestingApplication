package com.example.testingapplication

import com.example.testingapplication.vm.MainViewModelTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainViewModelTest::class,
    CalculatorTest::class,
)
class TestSuite
