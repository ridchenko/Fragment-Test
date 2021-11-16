package com.example.fragmenttest

import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmenttest.ButtonType.*

class FragmentDetails : Fragment(R.layout.fragmenl_details) {

    private val listItem: List<Int> =
        listOf(R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5, R.id.textView6,)

    fun buttonPressed(type: ButtonType) = when (type) {
        FIRST -> setText("first button was pressed")
        SECOND -> setText("second button was pressed")
        THIRD -> setText("third button was pressed")
        FOURTH -> setText("the fourth button was pressed")
    }

    private fun setText(text: String) {
        listItem.forEach {
            view?.findViewById<TextView>(it)?.text = text
        }
    }

}