package ru.vincetti.test.movavimeetup

import com.kaspersky.kaspresso.screens.KScreen

object MainScreen : KScreen<MainScreen>() {

    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java

    val showToastButton = KButton {
        withId(R.id.main_activity_button)
    }
}
