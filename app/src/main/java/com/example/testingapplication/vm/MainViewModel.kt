package com.example.testingapplication.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testingapplication.Calculator
import com.example.testingapplication.ICalculator

class MainViewModel(private val calculator: ICalculator = Calculator()) : ViewModel() {
    val calculatedSum = MutableLiveData<Int>()

    init {
        calculatedSum.value = 0
    }

    fun calculateSum(firstNumber : Int, secondNumber : Int) {
        calculatedSum.value = calculator.getCalculatedSum(firstNumber,secondNumber)
    }
}