package com.example.kaspressosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendButton = findViewById<Button>(R.id.buttonSend)
        val editTextMessage = findViewById<EditText>(R.id.editTextMessage)
        val messageText = findViewById<TextView>(R.id.textViewMessage)
        messageText.text = ""

        sendButton.setOnClickListener {
            messageText.text = editTextMessage.text
            editTextMessage.text.clear()
        }
    }

}