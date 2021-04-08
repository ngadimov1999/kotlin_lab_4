package com.example.retrofit_example

import org.junit.Rule
import org.junit.Test
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule


class UITest {

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun isListShown() {
        //onView(withId(R.id.listRv)).check(doesNotExist())
        //onView(withId(R.id.listRv)).check(matches(isEnabled()))
        onView(withId(R.id.title)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }
}