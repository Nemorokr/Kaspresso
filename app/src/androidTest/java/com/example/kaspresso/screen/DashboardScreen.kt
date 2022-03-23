package com.example.kaspresso.screen

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.kaspresso.R

class DashboardScreen: Screen<DashboardScreen>() {

    private val dashboardScreenText = KTextView { withId (R.id.text_dashboard) }
    private val dashboardBtn = KButton { withId(R.id.navigation_dashboard) }

    fun checkDashboardScreenText (text: String) {
        dashboardScreenText.hasText(text)
    }

    fun clickDashboardBtn() {
        dashboardBtn.click()
    }
}