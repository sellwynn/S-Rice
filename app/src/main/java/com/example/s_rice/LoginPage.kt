package com.example.s_rice

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            val intent = Intent(this@LoginPage, HomePage::class.java)
            startActivity(intent)
            finish()


        }
    }
}
