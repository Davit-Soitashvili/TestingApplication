package com.example.testingapplication.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testingapplication.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get : Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun openMainFragmentBtn_is_displayed() {
        onView(withId(R.id.openMainFragmentBtn)).check(matches(isDisplayed()))
    }

    @Test
    fun fragmentContainer_is_displayed() {
        onView(withId(R.id.fragmentContainer)).check(matches(isDisplayed()))
    }

    @Test
    fun navigateToMainFragmentAndBack_works_correctly() {
        onView(withId(R.id.openMainFragmentBtn)).perform(click())
        onView(withId(R.id.mainFragment)).check(matches(isDisplayed()))
    }
}