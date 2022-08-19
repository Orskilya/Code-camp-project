package com.example.keys_shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signIn()
    }

    private fun signIn() {
        //Ставим кликер на кнопку
        findViewById<Button>(R.id.button).setOnClickListener {
            //Получаем логин из поля ввода логина
            val login =
                findViewById<EditText>(R.id.editTextLogin).text.toString()
            //Получаем пароль из поля ввода пароля
            val password =
                findViewById<EditText>(R.id.editTextPassword).text.toString()
            //Проверяем логин и пароль на пустоту
            if (login.isNotEmpty() && password.isNotEmpty()) {
                //Логин и пароль не пустые. Переключаем на следющий экран
                //Создаем "мост" между экранами
                val intent = Intent(this, KeysListActivity::class.java)
                //Запускаем следующий экран
                startActivity(intent)
            } else {
                //Логин и пароль пустые.
                Toast.makeText(
                    this, "Оба поля должны быть заполнены",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
