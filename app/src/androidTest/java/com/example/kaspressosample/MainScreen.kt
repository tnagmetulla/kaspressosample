package com.example.kaspressosample

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

object MainScreen : KScreen<MainScreen>() {
    override val layoutId = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java

    // Объявите вьюшки с которыми хотите работать (поле ввода, кнопка отправки, само сообщение)
    //R.id.editTextMessage, R.id.buttonSend, R.id.textViewMessage

}

