package com.example.testingapplication.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testingapplication.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainFragmentTest {
    @get : Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun allViews_are_displayed() {
        onView(withId(R.id.openMainFragmentBtn)).perform(click())
        onView(withId(R.id.calculateBtn)).check(matches(isDisplayed()))
        onView(withId(R.id.resultView)).check(matches(isDisplayed()))
        onView(withId(R.id.firstNumberInputView)).check(matches(isDisplayed()))
        onView(withId(R.id.secondNumberInputView)).check(matches(isDisplayed()))
    }

    @Test
    fun displaySum_works_correctly() {
        val firstNumber = "10"
        val secondNumber = "20"
        val sum = "30"
        onView(withId(R.id.openMainFragmentBtn)).perform(click())
        onView(withId(R.id.firstNumberInputView)).perform(replaceText(firstNumber))
        onView(withId(R.id.secondNumberInputView)).perform(replaceText(secondNumber))
        onView(withId(R.id.calculateBtn)).perform(click())
        onView(withId(R.id.resultView)).check(matches(withText(sum)))
    }
}