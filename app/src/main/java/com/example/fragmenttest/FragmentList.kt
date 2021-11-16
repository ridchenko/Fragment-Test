package com.example.fragmenttest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


interface FragmentListClickListener {
    fun onItemClick()
}

class FragmentList : Fragment(R.layout.fragment_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.button1)?.setOnClickListener {
            (requireActivity() as? FragmentListClickListener)?.onItemClick()
        }
    }
}