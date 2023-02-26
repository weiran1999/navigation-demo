package com.weiran.navigation.ui.fragment.simple_bottom_nav.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.weiran.navigation.R

class Title : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_simple_nav_title, container, false)

        view.findViewById<Button>(R.id.about_btn).setOnClickListener {
            findNavController().navigate(R.id.action_title_to_about)
        }
        return view
    }
}
