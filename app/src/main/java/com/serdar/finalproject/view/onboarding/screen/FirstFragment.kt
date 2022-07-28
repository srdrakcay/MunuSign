package com.serdar.finalproject.view.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.serdar.finalproject.R
import com.serdar.finalproject.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {


    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            val viewPager = activity?.findViewById<ViewPager2>(R.id.viewpager)
            viewPager?.currentItem = 1
        }
    }

}