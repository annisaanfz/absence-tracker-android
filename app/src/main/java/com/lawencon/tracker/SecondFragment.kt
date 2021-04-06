package com.lawencon.tracker

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lawencon.tracker.view.DetailTracker
import com.lawencon.tracker.view.ReportAdapter


class SecondFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ReportAdapter.ViewHolder>? = null

    private lateinit var rootView : View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_dua, container, false)
        return  rootView
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        val recyclerView : RecyclerView = itemView.findViewById(R.id.recylerView)
        super.onViewCreated(itemView, savedInstanceState)
        recyclerView.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ReportAdapter()
        }
    }
}