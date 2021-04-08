package com.lawencon.tracker.ui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lawencon.tracker.R
import com.lawencon.tracker.ui.view.ReportRealtimeActivity
import com.lawencon.tracker.ui.view.DetailTrackerActivity

class ReportAdapter : RecyclerView.Adapter<ReportAdapter.ViewHolder>() {

    private val nama = arrayOf("Annisa", "Dina", "Atalya", "Wili", "Daus", "Dia", "Ok", "Tes", "Tes2")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val itemNama: TextView = itemView.findViewById(R.id.nama)
        val itemPlay : ImageButton = itemView.findViewById(R.id.imageButton)

        init {

            itemView.setOnClickListener {
                var position: Int = getAdapterPosition()
                val context = itemView.context
                val intent = Intent(context, ReportRealtimeActivity::class.java).apply {
                    putExtra("NUMBER", position)
                    putExtra("NAMA", itemNama.text)
                }
                context.startActivity(intent)
            }
        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row, viewGroup, false)
        val context = v.context
        val imageButton: ImageButton = v.findViewById(R.id.imageButton)
        imageButton.setOnClickListener() {
            val i = Intent(context, DetailTrackerActivity::class.java)
                context.startActivity(i)
            }
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemNama.text = nama[i]
    }

    override fun getItemCount(): Int {
        return nama.size
    }
}