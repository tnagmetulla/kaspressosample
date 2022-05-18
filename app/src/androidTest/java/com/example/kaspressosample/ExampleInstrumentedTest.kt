package com.example.kaspressosample

import androidx.test.rule.ActivityTestRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class ExampleInstrumentedTest : TestCase() {

    @get:Rule
    val activityRule =
        ActivityTestRule(MainActivity::class.java, true, true) // нужен для запуска активити в тесте

    @Test
    fun checkMessage() {
        //Написать сообщение, отправить, проверить что появилось
    }
}

