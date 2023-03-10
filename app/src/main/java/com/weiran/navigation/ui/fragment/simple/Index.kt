package com.weiran.navigation.ui.fragment.simple

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.weiran.navigation.R

class Index : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_index, container, false)
        view.findViewById<Button>(R.id.play_btn).setOnClickListener {
            findNavController().navigate(R.id.action_title_screen_to_register)
        }
        return view
    }

}