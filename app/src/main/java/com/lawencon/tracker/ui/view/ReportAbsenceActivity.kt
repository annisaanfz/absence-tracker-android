package com.lawencon.tracker.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lawencon.tracker.R

class ReportAbsenceActivity : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tiga, container, false)
    }

    companion object {
        fun newInstance(): ReportRealtimeActivity {
            val fragment = ReportRealtimeActivity()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}