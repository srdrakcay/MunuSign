package com.serdar.finalproject.view.onboarding.viewpager

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import com.serdar.finalproject.databinding.FragmentViewPagerBinding
import com.serdar.finalproject.view.onboarding.ViewPagerAdapter
import com.serdar.finalproject.view.onboarding.screen.FirstFragment
import com.serdar.finalproject.view.onboarding.screen.SecondScreen
import com.serdar.finalproject.view.onboarding.screen.ThirdScreen


class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)


        val fragmentList = arrayListOf<Fragment>(
            FirstFragment(),
            SecondScreen(),
            ThirdScreen()

        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        Handler(Looper.getMainLooper()).post {
            binding.viewpager.adapter = adapter
        }
        return binding.root
    }

}
