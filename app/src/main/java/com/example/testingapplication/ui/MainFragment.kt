package com.example.testingapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.testingapplication.R
import com.example.testingapplication.vm.MainViewModel

class MainFragment : Fragment() {

    private lateinit var firstNumberInput: EditText
    private lateinit var secondNumberInput: EditText
    private lateinit var resultView: TextView
    private lateinit var calculateBtn : Button
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        firstNumberInput = view.findViewById(R.id.firstNumberInputView)
        secondNumberInput = view.findViewById(R.id.secondNumberInputView)
        resultView = view.findViewById(R.id.resultView)
        calculateBtn = view.findViewById(R.id.calculateBtn)

        mainViewModel.calculatedSum.observe(this) {
            displaySum(it)
        }
        calculate()
    }

    private fun calculate() {
        calculateBtn.setOnClickListener {
            val firstNumber = firstNumberInput.text.toString().toInt()
            val secondNumber = secondNumberInput.text.toString().toInt()
            mainViewModel.calculateSum(firstNumber,secondNumber)
        }
    }

    private fun displaySum(sum: Int) {
        resultView.text = sum.toString()
    }
}