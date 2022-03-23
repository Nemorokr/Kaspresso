package com.example.kaspresso.screen

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.kaspresso.R

class HomeScreen : Screen<HomeScreen>() {

    private val homeScreenText = KTextView { withId(R.id.text_home) }
    private val homeScreenBtn = KButton { withId(R.id.navigation_home) }

    fun checkHomeScreenText (text: String) {
        homeScreenText.hasText(text)
    }

    fun clickHomeScreenBtn() {
        homeScreenBtn.click()
    }
}