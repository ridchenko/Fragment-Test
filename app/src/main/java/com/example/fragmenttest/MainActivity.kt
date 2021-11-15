package com.example.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FragmentListClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    override fun onItemClick() {
        (supportFragmentManager.findFragmentByTag(
            "tag_details"
        ) as? FragmentDetails)?.buttonPressed()
    }
}