package com.eslam.triviaapp.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.eslam.triviaapp.R
import com.eslam.triviaapp.databinding.FragmentHomeScreenBinding

class HomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentHomeScreenBinding>(inflater, R.layout.fragment_home_screen, container, false)

        binding.playButton.setOnClickListener {
            findNavController().navigate(HomeScreenDirections.actionHomeScreenToOnGame())
        }
        return binding.root
    }

}