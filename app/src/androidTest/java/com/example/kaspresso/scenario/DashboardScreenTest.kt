package com.example.kaspresso.scenario

import androidx.test.rule.ActivityTestRule
import com.example.kaspresso.MainActivity
import com.example.kaspresso.screen.DashboardScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
class DashboardScreenTest: TestCase() {

    @Rule
    @JvmField
    var rule = ActivityTestRule(MainActivity::class.java, false, false)

    private val screen = DashboardScreen()

    @Test
    fun dashboardScreenTextIsDisplayed() = before {
        // skipped
    }.after {
        //skipped
    }.run{
        screen {
            step("Open App") {
                rule.launchActivity(null)
            }

            step("Switch to Dashboard Screen") {
                clickDashboardBtn()
            }

            step("Check the text inside textView") {
                checkDashboardScreenText(DASHBOARD_SCREEN_TEXT)
            }
        }
    }

    companion object {
        const val DASHBOARD_SCREEN_TEXT = "This is dashboard Fragment"
    }
}