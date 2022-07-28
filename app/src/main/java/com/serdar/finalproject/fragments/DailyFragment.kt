package com.serdar.finalproject.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.serdar.finalproject.databinding.FragmentDailyBinding
import com.serdar.finalproject.model.horoscope.DailyActivity


class DailyFragment : Fragment() {
    private lateinit var binding: FragmentDailyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDailyBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttondailyg.setOnClickListener {
            val intent = Intent(requireActivity(), DailyActivity::class.java)
            startActivity(intent)

        }

    }
}