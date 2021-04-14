package com.example.MembacaEBook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_buku.view.*

class BukuAdapter(val list:List<Book>) : RecyclerView.Adapter<BukuAdapter.ViewHolder>() {
    var onItemClickListener: ((Book) -> Unit)? = null

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(buku : Book){
         with(itemView) {
                itemImage.setImageResource(buku.gambar)
                itemNama.text = buku.nama
                itemPetikan.text = buku.petikan
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_buku, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val buku = list.get(position)
        holder.bind(buku)
        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(buku)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}