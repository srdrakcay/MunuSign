package com.serdar.finalproject.view.bottombar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import com.serdar.finalproject.databinding.FragmentHoroscopesBinding
import com.serdar.finalproject.model.horoscope.DetailActivity


class HoroscopesFragment : Fragment() {
    private lateinit var binding: FragmentHoroscopesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoroscopesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.aries.setOnClickListener { startDestiny() }
        binding.taurus.setOnClickListener { startDestiny() }
        binding.gemini.setOnClickListener { startDestiny() }
        binding.cancer.setOnClickListener { startDestiny() }
        binding.leo.setOnClickListener { startDestiny() }
        binding.virgo.setOnClickListener { startDestiny() }
        binding.libra.setOnClickListener { startDestiny() }
        binding.scropio.setOnClickListener { startDestiny() }
        binding.sagitarius.setOnClickListener { startDestiny() }
        binding.capricorn.setOnClickListener { startDestiny() }
        binding.aquarius.setOnClickListener { startDestiny() }
        binding.pisces.setOnClickListener { startDestiny() }

    }

    private fun startDestiny() {
        val intent = Intent(requireActivity(), DetailActivity::class.java)
        startActivity(intent)
    }

}