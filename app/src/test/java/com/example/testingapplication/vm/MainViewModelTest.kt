package com.example.testingapplication.vm

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.testingapplication.Calculator
import org.junit.Assert.*

import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var mainViewModel: MainViewModel

    @Before
    fun init() {
        mainViewModel = MainViewModel(Calculator())
    }

    @Test
    fun init_value_is_valid() {
        assertEquals(mainViewModel.calculatedSum.value, 0)
    }

    @Test
    fun calculateSum_is_valid() {
        mainViewModel.calculateSum(5,10)
        assertEquals(mainViewModel.calculatedSum.value, 15)
    }
}