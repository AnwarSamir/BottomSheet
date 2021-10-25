package com.hmlabs.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {

    //#1 Defining a BottomSheetBehavior instance
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<LinearLayoutCompat>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // show bottom sheet dialog
//        BottomSheetFragment() { sortKey ->
//        }.apply {
//            show(this@MainActivity.supportFragmentManager, "")
//            isCancelable = false
//        }
        handleBottomSheet()
    }



    private fun handleBottomSheet() {
        //#2 Initializing the BottomSheetBehavior
        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheet))
        //#3 Listening to State Changes of BottomSheet
        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {

            }
        })

        val adapter =Adapter(listOf("item 1","item 1","item 1","item 1","item 1","item 1","item 1","item 1","item 1","item 1","item 1"))
        findViewById<RecyclerView>(R.id.rv).adapter = adapter

    }
}