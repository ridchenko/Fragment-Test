package com.example.fragmenttest

import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentDetails : Fragment(R.layout.fragmenl_details) {
    fun buttonPressed() {
        view?.findViewById<TextView>(R.id.textView1)?.text = "Button was pressed"
    }
}