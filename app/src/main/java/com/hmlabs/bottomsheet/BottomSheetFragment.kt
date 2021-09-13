package com.hmlabs.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import androidx.recyclerview.widget.RecyclerView
import com.hmlabs.bottomsheet.databinding.ViewBottomSheetBinding



class BottomSheetFragment(val onApplyClicked: (String) -> Unit) :
    BaseBottomSheet<ViewBottomSheetBinding>() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.ivClose.setOnClickListener {
            this.dismiss()
        }

        binding.btnApply.setOnClickListener {
            onApplyClicked("")
        }

    }





    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        b: Boolean
    ) = ViewBottomSheetBinding.inflate(layoutInflater)



}