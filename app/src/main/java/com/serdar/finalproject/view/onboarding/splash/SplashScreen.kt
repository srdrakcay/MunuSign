package com.serdar.finalproject.view.onboarding.splash

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.serdar.finalproject.R
import com.serdar.finalproject.databinding.FragmentSplashScreenBinding
import com.serdar.finalproject.view.login.SignInActivity


class SplashScreen : Fragment() {

    private lateinit var binding: FragmentSplashScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashScreenBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


            // Change to delayed method
        Handler().postDelayed(
            {
                if (onBoardingFinished()) {
                    val intent = Intent(requireActivity(), SignInActivity::class.java)
                    startActivity(intent)
                    requireActivity().finish()
                } else {
                    findNavController().navigate(R.id.action_splashScreen2_to_viewPagerFragment)

                }
            },
            3000
        )


    }

    private fun onBoardingFinished(): Boolean {
        val sp = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)

        return sp.getBoolean("Finished", false)

    }


}


