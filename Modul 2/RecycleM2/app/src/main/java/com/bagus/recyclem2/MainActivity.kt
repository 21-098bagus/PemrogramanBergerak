package com.bagus.recyclem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val itemList = listOf(
        Item("PEMROGRAMAN BERGERAK", "Ir Ach Dafid,S.T.M.T"),
        Item("PRAKTIKUM SMBD", "LALALA"),
        Item("SMBD", "Rosida"),
        Item("SISTEM PENDUKUNG KEPUTUSAN", "Sri Herawati"),
        Item("IIPPL", "ALI SYAKUR"),
        Item("PEMROGRAMAN BERGERAK", "Ir Ach Dafid,S.T.M.T"),
        Item("PRAKTIKUM SMBD", "LALALA"),
        Item("SMBD", "Rosida"),
        Item("SISTEM PENDUKUNG KEPUTUSAN", "Sri Herawati"),
        Item("IIPPL", "ALI SYAKUR")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(itemList)
    }
}
