package com.example.s_rice

import android.os.Bundle
import android.widget.Button
import android.widget.ViewFlipper
import androidx.appcompat.app.AppCompatActivity

class ResetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password) // use your actual layout name

        val viewFlipper = findViewById<ViewFlipper>(R.id.viewFlipper)
        val btnSendCode = findViewById<Button>(R.id.btnSendCode)
        val btnConfirmCode = findViewById<Button>(R.id.btnConfirmCode)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSendCode.setOnClickListener {
            viewFlipper.showNext()
        }
        btnConfirmCode.setOnClickListener {
            viewFlipper.showNext()
        }
        btnSave.setOnClickListener {
            // Optionally, show a message or finish the activity
            // Toast.makeText(this, "Password reset!", Toast.LENGTH_SHORT).show()
        }
    }
}