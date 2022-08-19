package com.example.keys_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class ThirdItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_item)
        onButtonClick()
    }

    private fun onButtonClick() {
        findViewById<Button>(R.id.buttonBuy).setOnClickListener {
            Toast.makeText(
                applicationContext, "Игра добавлена в корзину!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
