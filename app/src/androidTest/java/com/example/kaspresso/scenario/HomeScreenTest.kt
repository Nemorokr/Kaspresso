package com.example.kaspresso.scenario

import androidx.test.rule.ActivityTestRule
import com.example.kaspresso.MainActivity
import com.example.kaspresso.screen.HomeScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
class HomeScreenTest: TestCase() {

    @Rule
    @JvmField
    var rule = ActivityTestRule(MainActivity::class.java, false, false)

    private val screen = HomeScreen()

    @Test
    fun homeScreenTextIsDisplayed() = before {
        //skipped
    }.after {
        //skipped
    }.run {
        screen {
            step("Open App") {
                rule.launchActivity(null)
            }

            step("Switch to Home Screen") {
                clickHomeScreenBtn()
            }

            step("Check the text inside textView") {
                checkHomeScreenText(HOME_SCREEN_TEXT)
            }
        }
    }

    companion object {
        const val HOME_SCREEN_TEXT = "This is home Fragment"
    }
}