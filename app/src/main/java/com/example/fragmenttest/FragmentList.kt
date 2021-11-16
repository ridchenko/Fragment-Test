package com.example.fragmenttest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmenttest.ButtonType.*


interface FragmentListClickListener {
    fun onItemClick(type: ButtonType)
}

class FragmentList : Fragment(R.layout.fragment_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            findViewById<TextView>(R.id.button1)?.setOnClickListener { onButtonClick(FIRST) }
            findViewById<TextView>(R.id.button2)?.setOnClickListener { onButtonClick(SECOND) }
            findViewById<TextView>(R.id.button3)?.setOnClickListener { onButtonClick(THIRD) }
            findViewById<TextView>(R.id.button4)?.setOnClickListener { onButtonClick(FOURTH) }
        }

    }

    private fun onButtonClick(type: ButtonType) {
        (requireActivity() as? FragmentListClickListener)?.onItemClick(type)
    }
}