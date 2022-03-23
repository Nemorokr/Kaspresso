package com.example.kaspresso.scenario

import androidx.test.rule.ActivityTestRule
import com.example.kaspresso.MainActivity
import com.example.kaspresso.screen.NotificationsScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.qameta.allure.android.rules.ScreenshotRule
import io.qameta.allure.android.runners.AllureAndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AllureAndroidJUnit4::class)
class NotificationsScreenTest: TestCase() {

    @Rule
    @JvmField
    var rule = ActivityTestRule(MainActivity::class.java, false, false)
    @Rule
    val logcatRule = ScreenshotRule(mode = ScreenshotRule.Mode.END, screenshotName = "ss_end")

    private val screen = NotificationsScreen()

    @Test
    fun notificationsScreenTextIsDisplayed() = before {
        // skipped
    }.after {
        //skipped
    }.run{
        screen {
            step("Open App") {
                rule.launchActivity(null)
            }

            step("Switch to Notifications Screen") {
                clickNotificationsScreenBtn()
            }

            step("Check the text inside textView") {
                checkNotificationsScreenText(NOTIFICATIONS_SCREEN_TEXT)
            }
        }
    }

    companion object {
        const val NOTIFICATIONS_SCREEN_TEXT = "This is notifications Fragment"
    }
}