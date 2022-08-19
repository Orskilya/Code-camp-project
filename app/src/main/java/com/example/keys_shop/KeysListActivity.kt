package com.example.keys_shop


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class KeysListActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var namesOfGame = arrayOf("Grand Theft Auto V",
        "Elden Ring", "Minecraft", "Call Of Duty")
    private var pricesOfKey = arrayOf("599 руб.", "879 руб.", "99 руб.", "177 руб .")

    private
    val adapter by lazy {
        RecyclerAdapterForList(namesOfGame, pricesOfKey)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keys_list)
        layoutManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        adapter.onClickListener = { position ->
            when (position) {
                0 -> {
                    val intent = Intent(this, FirstItemActivity::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent = Intent(this, SecondItemActivity::class.java)
                    startActivity(intent)
                }
                2 -> {
                    val intent = Intent(this, ThirdItemActivity::class.java)
                    startActivity(intent)
                }
                3 -> {
                    val intent = Intent(this, FourthItemActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
