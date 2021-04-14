package com.example.MembacaEBook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_activity.*

class detail_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_activity)

        val buku = intent.getParcelableExtra<Book>("BUKU")
        buku?.apply {
            detailImage.setImageResource(gambar)
            detailName.text = nama
            detailPetikan.text = petikan
            detailUrl.text = url
        }

    }
}