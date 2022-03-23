package com.example.kaspresso.screen

import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.kaspresso.R

class NotificationsScreen: Screen<NotificationsScreen>() {

    private val notificationsScreenText = KTextView { withId(R.id.text_notifications) }
    private val notificationsScreenBtn = KButton {withId(R.id.navigation_notifications)}

    fun checkNotificationsScreenText (text: String) {
        notificationsScreenText.hasText(text)
    }

    fun clickNotificationsScreenBtn() {
        notificationsScreenBtn.click()
    }
}