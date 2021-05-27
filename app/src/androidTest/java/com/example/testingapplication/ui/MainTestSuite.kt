package com.example.testingapplication.ui

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    MainFragmentTest::class,
)
class MainTestSuite