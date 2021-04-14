//Marcheilla Trecya A (18.12.0849)

package com.example.MembacaEBook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.layoutManager = LinearLayoutManager(this)
        val list = BukuData.list
        val adapter = BukuAdapter(list)
        recyclerview.adapter = adapter
        recyclerview.addItemDecoration(DividerItemDecoration(this , LinearLayout.VERTICAL))
        adapter.onItemClickListener = {
//            Toast.makeText(this, it.nama, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, detail_activity::class.java)
            intent.putExtra("BUKU", it)
            startActivity(intent)
        }
    }
}