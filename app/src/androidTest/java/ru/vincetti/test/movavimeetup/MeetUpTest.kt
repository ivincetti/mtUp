package ru.vincetti.test.movavimeetup

import androidx.test.core.app.ActivityScenario
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Test

class MeetUpTest : TestCase() {

    @Test
    fun checkToastMessage_clickButton() {
        run {
            step("Запустить приложение") {
                ActivityScenario.launch(MainActivity::class.java)
            }
            step("Нажать на кнопку") {
                MainScreen {
                    showToastButton.click()
                }
            }
            step("Проверить текст в toast") {
                MainScreen {
                    toastMessage.hasText(R.string.main_activity_toast_text)
                }
            }
        }
    }
}
